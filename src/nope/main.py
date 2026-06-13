import sys
import subprocess
from pathlib import Path
from argparse import ArgumentParser
from antlr4 import *
from antlr4.tree.Tree import TerminalNode
import graphviz

from nope.GraphRenderer import GraphRenderer
from nope.antlr_generated.NOPELexer import NOPELexer
from nope.antlr_generated.NOPEParser import NOPEParser
from nope.NOPECompiler import NopeCompiler, NopeCompilationError
from nope.NOPELinter import NopeLinter


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

    return cli_parser.parse_args()


def process_code(
    input_text: str,
    input_stream: InputStream,
    output_name: str,
    args: any,
):
    """Core logic to parse the stream, compile, and optionally generate graphs."""

    linter = NopeLinter()
    warnings = linter.lint(input_text)

    if warnings:
        for warning in warnings:
            print(warning, file=sys.stderr)
        print("", file=sys.stderr)

    lexer = NOPELexer(input_stream)
    stream = CommonTokenStream(lexer)

    parser = NOPEParser(stream)
    tree = parser.program()

    if parser.getNumberOfSyntaxErrors() > 0:
        print(
            "Błąd: Znaleziono błędy składniowe w kodzie wejściowym. Przerwano.",
            file=sys.stderr,
        )
        return

    if args.generate_graph:
        g_out_dir = Path(args.g_out_dir)
        renderer = GraphRenderer.create_default_digraph(parser)

        header = "Source Code:\n" + "-" * 40 + "\n"
        formatted_code = header + input_text
        safe_text = formatted_code.replace("\\", r"\\").replace('"', r"\"")
        graphviz_label = safe_text.replace("\n", r"\l") + r"\l"

        renderer.graph.attr(
            label=graphviz_label,
            labelloc="t",
            labeljust="l",
            fontname="monospace",
            fontsize="12",
        )

        renderer.render(
            tree,
            filename=output_name,
            file_format=args.graph_format,
            directory=g_out_dir,
            view=args.view,
        )
        print(
            f"Generated {output_name}.{args.graph_format} successfully in: {g_out_dir.resolve()}"
        )

    if not args.no_compile:
        c_out_dir = Path(args.c_out_dir)
        c_out_dir.mkdir(parents=True, exist_ok=True)

        print("Translating NOPE to C...")

        try:
            compiler = NopeCompiler()
            c_code = compiler.compile(tree)

            c_output_filename = c_out_dir / f"{output_name}.c"

            with open(c_output_filename, "w", encoding="utf-8") as f:
                f.write(c_code)

            print(f"Generated C code successfully: {c_output_filename.resolve()}")

            if args.build:
                exe_out_dir = Path(args.exe_out_dir)
                exe_out_dir.mkdir(parents=True, exist_ok=True)

                exe_output_filename = exe_out_dir / f"{output_name}.exe"

                runtime_dir = Path(__file__).parent  # / "src"
                runtime_c = runtime_dir / "nope_runtime.c"

                compile_cmd = [
                    args.cc,
                    str(c_output_filename),
                    str(runtime_c),
                    "-I",
                    str(runtime_dir),
                    "-o",
                    str(exe_output_filename),
                ]

                print(f"Building executable with {args.cc}...")

                try:
                    result = subprocess.run(compile_cmd, capture_output=True, text=True)

                    if result.returncode == 0:
                        print(
                            f"Generated executable successfully: {exe_output_filename.resolve()}\n"
                        )
                    else:
                        print(
                            f"[{args.cc}] Compilation Error:\n{result.stderr}",
                            file=sys.stderr,
                        )

                except FileNotFoundError:
                    print(
                        f"Error: Compiler '{args.cc}' was not found "
                        f"Please make sure you are correctly installed the compiler and you added it to PATH.",
                        file=sys.stderr,
                    )

        except NopeCompilationError as e:
            print(f"Compilation Error: {e}", file=sys.stderr)

        except Exception as e:
            print(f"Error during compilation: {e}", file=sys.stderr)


def main():
    args = parse_arguments()

    fallback_name = args.name if args.name else "a"

    if args.input_files:
        for file_path_str in args.input_files:
            file_path = Path(file_path_str)
            print(f"--- Processing file: {file_path} ---")

            if not file_path.exists():
                print(f"Error: File '{file_path}' does not exists.", file=sys.stderr)
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
