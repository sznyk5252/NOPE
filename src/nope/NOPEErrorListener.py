from antlr4.error.ErrorListener import ErrorListener
from lsprotocol.types import Diagnostic, Range, Position

class NopeErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        # Zbieramy wszystkie błędy do tej listy
        self.diagnostics = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        """
        Ta metoda jest wywoływana przez ANTLR za każdym razem, gdy napotka błąd.
        """
        # MAGICZNY TRIK LSP: 
        # ANTLR liczy linie od 1, a kolumny od 0.
        # VS Code (LSP) liczy linie od 0 i kolumny od 0!
        start_line = line - 1
        start_char = column

        # Próbujemy ustalić długość błędnego słowa, by ładnie podkreślić całość.
        # Jeśli nie ma symbolu (np. koniec pliku), podkreślamy chociaż 1 znak.
        length = len(offendingSymbol.text) if offendingSymbol and offendingSymbol.text else 1
        
        start_pos = Position(line=start_line, character=start_char)
        end_pos = Position(line=start_line, character=start_char + length)

        # Tworzymy obiekt błędu gotowy do wysłania do VS Code
        diag = Diagnostic(
            range=Range(start=start_pos, end=end_pos),
            message=msg,  # Domyślny, szczegółowy komunikat z ANTLR
            source="NOPE Parser"
        )
        self.diagnostics.append(diag)