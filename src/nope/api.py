import sys
import subprocess
from pathlib import Path
from types import SimpleNamespace

# from antlr4 import *
from antlr4 import InputStream, CommonTokenStream
import graphviz

from nope.GraphRenderer import GraphRenderer
from nope.antlr_generated.NOPELexer import NOPELexer
from nope.antlr_generated.NOPEParser import NOPEParser
from nope.NOPECompiler import NopeCompiler, NopeCompilationError
from nope.NOPELinter import NopeLinter


def process_code(
    input_text: str,
    input_stream: InputStream,
    output_name: str,
    args: SimpleNamespace,
):
    """Core logic to parse the stream, compile, and optionally generate graphs."""

    linter = NopeLinter()
    input_text = input_text.rstrip(" \t\r\n")
    cleaned = [line.rstrip(" \t\r") for line in input_text.splitlines()]
    input_text = "\n".join(cleaned)
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
            "Error: Syntax errors found in the input NOPE code. Aborting.",
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
        if args.verbouse:
            print(
                f"Generated {output_name}.{args.graph_format} successfully in: {g_out_dir.resolve()}"
            )

    if not args.no_compile:
        c_out_dir = Path(args.c_out_dir)
        c_out_dir.mkdir(parents=True, exist_ok=True)

        if args.verbouse:
            print("Translating NOPE to C...")

        try:
            compiler = NopeCompiler()
            c_code = compiler.compile(tree, args.snippet_len)

            c_output_filename = c_out_dir / f"{output_name}.c"

            with open(c_output_filename, "w", encoding="utf-8") as f:
                f.write(c_code)

            if args.verbouse:
                print(f"Generated C code successfully: {c_output_filename.resolve()}")

            if args.build:
                exe_out_dir = Path(args.exe_out_dir)
                exe_out_dir.mkdir(parents=True, exist_ok=True)

                exe_output_filename = exe_out_dir / f"{output_name}.exe"

                runtime_dir = Path(__file__).parent
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

                if args.verbouse:
                    print(f"Building executable with {args.cc}...")

                try:
                    result = subprocess.run(compile_cmd, capture_output=True, text=True)

                    if result.returncode == 0:
                        if args.verbouse:
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
                        f"Error: Compiler '{args.cc}' was not found. "
                        f"Please make sure it is correctly installed and added to PATH.",
                        file=sys.stderr,
                    )

        except NopeCompilationError as e:
            print(f"Compilation Error: {e}", file=sys.stderr)

        except Exception as e:
            print(f"Error during compilation: {e}", file=sys.stderr)


def compile_from_string(
    input_text: str,
    output_name: str = "a",
    c_out_dir: str = ".",
    build: bool = False,
    exe_out_dir: str = ".",
    cc: str = "gcc",
    generate_graph: bool = False,
    g_out_dir: str = "graphs",
    graph_format: str = "png",
    view: bool = False,
    no_compile: bool = False,
    verbouse: bool = False,
    snippet_length: int = 100,
):
    """
    Allows calling the NOPE compiler directly from other Python code,
    bypassing the CLI argument parsing.

    Return path to executable if build is True.
    """
    api_args = SimpleNamespace(
        no_compile=no_compile,
        c_out_dir=c_out_dir,
        build=build,
        cc=cc,
        exe_out_dir=exe_out_dir,
        generate_graph=generate_graph,
        g_out_dir=g_out_dir,
        graph_format=graph_format,
        view=view,
        verbouse=verbouse,
        snippet_len=snippet_length,
    )

    input_stream = InputStream(input_text)
    process_code(input_text, input_stream, output_name, api_args)
    if build:
        exe_out_dir_path = Path(exe_out_dir)
        return exe_out_dir_path / f"{output_name}.exe"
    return None


def compile_from_file(
    file_path: str | Path,
    output_name: str | None = None,
    c_out_dir: str = ".",
    build: bool = False,
    exe_out_dir: str = ".",
    cc: str = "gcc",
    generate_graph: bool = False,
    g_out_dir: str = "graphs",
    graph_format: str = "png",
    view: bool = False,
    no_compile: bool = False,
    verbouse: bool = False,
    snippet_length: int = 100,
) -> Path | None:
    """
    Reads NOPE source code from a file and compiles it directly from Python code,
    bypassing the CLI argument parsing.

    Return path to executable if build is True.
    """
    if isinstance(file_path, str):
        path = Path(file_path)
    else:
        path = file_path

    if not path.exists():
        raise FileNotFoundError(f"Source file not found: {path.resolve()}")

    with open(path, "r", encoding="utf-8") as f:
        input_text = f.read()

    # If no output name is provided, use the original file's name (without extension)
    if output_name is None:
        output_name = path.stem

    api_args = SimpleNamespace(
        no_compile=no_compile,
        c_out_dir=c_out_dir,
        build=build,
        cc=cc,
        exe_out_dir=exe_out_dir,
        generate_graph=generate_graph,
        g_out_dir=g_out_dir,
        graph_format=graph_format,
        view=view,
        verbouse=verbouse,
        snippet_len=snippet_length,
    )

    input_stream = InputStream(input_text)
    process_code(input_text, input_stream, output_name, api_args)
    # returns the executable
    if build:
        exe_out_dir_path = Path(exe_out_dir)
        return exe_out_dir_path / f"{output_name}.exe"
    return None
