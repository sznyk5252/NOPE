import sys
from pygls.lsp.server import LanguageServer
from lsprotocol.types import (
    TEXT_DOCUMENT_DID_OPEN,
    TEXT_DOCUMENT_DID_CHANGE,
    Diagnostic,
    Range,
    Position,
    PublishDiagnosticsParams,
)
from antlr4 import InputStream, CommonTokenStream
from nope.antlr_generated.NOPELexer import NOPELexer
from nope.antlr_generated.NOPEParser import NOPEParser
from .NOPEErrorListener import NopeErrorListener 

server = LanguageServer("nope-language-server", "v1.0")

def validate_nope(ls: LanguageServer, uri: str, document_text: str):
    """Tu dzieje się cała magia weryfikacji kodu NOPE w edytorze."""
    
    # 1. Standardowy setup ANTLR
    input_stream = InputStream(document_text)
    lexer = NOPELexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = NOPEParser(stream)

    # 2. Tworzymy naszego agenta i usuwamy stare nasłuchiwacze!
    error_listener = NopeErrorListener()
    
    lexer.removeErrorListeners()        # Usuwamy logowanie błędów leksykalnych do konsoli
    lexer.addErrorListener(error_listener)  # Dodajemy własne!

    parser.removeErrorListeners()       # Usuwamy logowanie błędów składniowych do konsoli
    parser.addErrorListener(error_listener) # Dodajemy własne!

    # 3. Odpalamy parser. 
    # (Jeśli w kodzie są błędy, nasz error_listener cichutko je złapie i zachowa w .diagnostics)
    parser.program()

    # 4. Wysyłamy zebrane błędy bezpośrednio do VS Code!
    ls.text_document_publish_diagnostics(
        PublishDiagnosticsParams(
            uri=uri,
            diagnostics=error_listener.diagnostics
        )
    )

@server.feature(TEXT_DOCUMENT_DID_OPEN)
async def did_open(ls: LanguageServer, params):
    """Uruchamia się od razu po otwarciu pliku .nope w edytorze."""
    document = ls.workspace.get_text_document(params.text_document.uri)
    validate_nope(ls, document.uri, document.source)

@server.feature(TEXT_DOCUMENT_DID_CHANGE)
async def did_change(ls: LanguageServer, params):
    """Uruchamia się przy każdym wpisaniu znaku przez użytkownika."""
    document = ls.workspace.get_text_document(params.text_document.uri)
    validate_nope(ls, document.uri, document.source)

if __name__ == "__main__":
    # Nasłuchujemy standardowego wejścia/wyjścia (tak wymaga VS Code)
    server.start_io()