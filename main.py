import sys
from pathlib import Path
from argparse import ArgumentParser
from antlr4 import *
from antlr4.tree.Tree import TerminalNode
import graphviz


from src.NOPELexer import NOPELexer
from src.NOPEParser import NOPEParser
from src.GraphRenderer import GraphRenderer


def parse_arguments():
    """Parses command line arguments and returns the parsed args object."""
    cli_parser = ArgumentParser(
        description="Parse NOPE program(s) and generate visual syntax trees."
    )

    cli_parser.add_argument(
        "input_files",
        nargs="*",
        help="Path(s) to the input NOPE file(s). If omitted, reads from standard input (stdin).",
    )

    cli_parser.add_argument(
        "-o",
        "--out-dir",
        default="graphs",
        help="Output directory for the generated graph(s) (default: 'graphs').",
    )
    cli_parser.add_argument(
        "-n",
        "--name",
        default="tree",
        help="Output filename (only used if reading from stdin or a single file). Defaults to 'tree'.",
    )
    cli_parser.add_argument(
        "-f",
        "--format",
        default="png",
        choices=["png", "pdf", "svg", "jpg"],
        help="Output file format (default: png).",
    )

    cli_parser.add_argument(
        "--styled",
        action="store_true",
        help="Generate a styled graph (colors, rounded boxes) instead of the default white one.",
    )
    cli_parser.add_argument(
        "--no-view",
        action="store_true",
        help="Disable automatically opening the generated graph file.",
    )

    return cli_parser.parse_args()


def process_code(input_text: str, input_stream: InputStream, output_name: str, args: any, output_dir: Path, should_view: bool):
    """Core logic to parse the stream and generate the Graphviz output."""
    
    # 1. Create lexer and token stream
    lexer = NOPELexer(input_stream)
    stream = CommonTokenStream(lexer)
    
    # 2. Create parser and build the tree
    parser = NOPEParser(stream)
    tree = parser.program()

    print(f"Parse tree (LISP): {tree.toStringTree(recog=parser)}")

    # 3. Initialize Renderer based on CLI flags
    if args.styled:
        renderer = GraphRenderer.create_styled_digraph(parser)
    else:
        renderer = GraphRenderer.create_default_digraph(parser)

    # ---------------------------------------------------------
    # NEW: ADD SOURCE CODE TO THE TOP OF THE GRAPH
    # ---------------------------------------------------------
    
    # Graphviz uses '\l' instead of '\n' for left-aligned text
    header = "Source Code:\n" + "-" * 40 + "\n"
    formatted_code = header + input_text
    
    # Replace standard Python newlines with Graphviz left-align newlines
    graphviz_label = formatted_code.replace('\n', '\\l') + '\\l'
    
    # Apply the label to the graph
    renderer.graph.attr(
        label=graphviz_label,
        labelloc="t",          # Place label at the 'top'
        labeljust="l",         # Justify label to the 'left'
        fontname="monospace",  # Use code-friendly font
        fontsize="12"
    )
    # ---------------------------------------------------------

    # 4. Render the graph
    renderer.render(
        tree, 
        filename=output_name, 
        file_format=args.format,  
        directory=output_dir, 
        view=should_view  
    )
    
    print(f"Generated {output_name}.{args.format} successfully in: {output_dir.resolve()}\n")

def main():
    args = parse_arguments()
    output_dir = Path(args.out_dir)

    # Scenario 1: User provided one or more files
    if args.input_files:
        for file_path_str in args.input_files:
            file_path = Path(file_path_str)
            print(f"--- Processing file: {file_path} ---")
            
            try:
                # Read the file to a string first so we can attach it to the image
                with open(file_path, 'r', encoding='utf-8') as f:
                    input_text = f.read()
                
                # Convert the string to an ANTLR InputStream
                input_stream = InputStream(input_text)
                
                if len(args.input_files) == 1 and args.name != "tree":
                    graph_name = args.name
                else:
                    graph_name = file_path.stem 

                # Pass BOTH the raw text and the stream
                process_code(input_text, input_stream, graph_name, args, output_dir, should_view=not args.no_view)
            
            except Exception as e:
                print(f"Error processing {file_path}: {e}\n")

    # Scenario 2: No files provided, read from standard input
    else:
        print("Reading from standard input (Type your code and press Ctrl+D / Ctrl+Z to finish):")
        input_text = sys.stdin.read()
        
        if not input_text.strip():
            print("No input provided. Exiting.")
            return

        input_stream = InputStream(input_text)
        process_code(input_text, input_stream, args.name, args, output_dir, should_view=not args.no_view)

if __name__ == "__main__":
    main()
