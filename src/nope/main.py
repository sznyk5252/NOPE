import sys
from pathlib import Path
from argparse import ArgumentParser
from antlr4 import InputStream

# Importing the core logic from our new API module
from nope.api import process_code


def parse_arguments():
    """Parses command line arguments and returns the parsed args object."""
    cli_parser = ArgumentParser(
        description="NOPE Compiler & Visual Syntax Tree Generator."
    )

    cli_parser.add_argument(
        "input_files",
        nargs="*",
        help="Path(s) to the input NOPE file(s). If omitted, reads from standard input (stdin).",
    )

    cli_parser.add_argument(
        "--no-compile",
        action="store_true",
        help="Skip C code generation (useful for syntax checking or graph generation only).",
    )
    cli_parser.add_argument(
        "-co",
        "--c-out-dir",
        default=".",
        help="Output directory for the compiled .c files (default: current directory).",
    )
    cli_parser.add_argument(
        "-b",
        "--build",
        action="store_true",
        help="Compile the generated .c file into an executable.",
    )
    cli_parser.add_argument(
        "--cc",
        default="gcc",
        choices=["gcc", "g++", "clang"],
        help="C compiler to use (default: gcc).",
    )
    cli_parser.add_argument(
        "-eo",
        "--exe-out-dir",
        default=".",
        help="Output directory for the compiled executables (default: current directory).",
    )
    cli_parser.add_argument(
        "--generate-graph",
        action="store_true",
        help="Generate the visual syntax tree (Graphviz).",
    )
    cli_parser.add_argument(
        "-go",
        "--g-out-dir",
        default="graphs",
        help="Output directory for the generated graph(s) (default: 'graphs').",
    )
    cli_parser.add_argument(
        "-n",
        "--name",
        default=None,
        help="Custom name for the output file(s) (default: input filename or 'a').",
    )
    cli_parser.add_argument(
        "-f",
        "--graph-format",
        default="png",
        choices=["png", "pdf", "svg", "jpg"],
        help="Output file format (default: png).",
    )
    cli_parser.add_argument(
        "--view",
        action="store_true",
        help="Enable automatically opening the generated graph file.",
    )
    cli_parser.add_argument(
        "--snippet-len",
        type=int,
        default=100,
        help="Maximum character length of the error snippet output (default: 100).",
    )
    cli_parser.add_argument(
        "--verbouse",
        action="store_true",
        help="Enable verbose output for detailed compilation and build information.",
    )

    return cli_parser.parse_args()


def main():
    args = parse_arguments()

    fallback_name = args.name if args.name else "a"

    if args.input_files:
        for file_path_str in args.input_files:
            file_path = Path(file_path_str)
            if len(args.input_files) > 1:
                print(f"--- Processing file: {file_path} ---")

            if not file_path.exists():
                print(f"Error: File '{file_path}' does not exist.", file=sys.stderr)
                continue

            try:
                with open(file_path, "r", encoding="utf-8") as f:
                    input_text = f.read()

                input_stream = InputStream(input_text)

                if len(args.input_files) == 1 and args.name is not None:
                    graph_name = args.name
                else:
                    graph_name = file_path.stem

                process_code(input_text, input_stream, graph_name, args)

            except Exception as e:
                print(f"Error processing {file_path}: {e}\n", file=sys.stderr)

    else:
        print(
            "Reading from standard input (Type your code and press Ctrl+D / Ctrl+Z to finish):"
        )
        input_text = sys.stdin.read()

        if not input_text.strip():
            print("No input provided. Exiting.")
            return

        input_stream = InputStream(input_text)
        process_code(input_text, input_stream, fallback_name, args)


if __name__ == "__main__":
    main()
