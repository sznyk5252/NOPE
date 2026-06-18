import re


class NopeLinter:
    def __init__(self):
        self.warnings: list[str] = []

    def lint(self, input_text: str) -> list[str]:
        """
        Scans the NOPE code for potential logical errors (code smells).
        Returns a list of formatted warnings.
        """
        self.warnings = []
        lines = input_text.splitlines()

        # if (
        #     input_text
        #     and not input_text.endswith("\n")
        #     and not input_text.endswith("\r")
        # ):
        #     self.warnings.append(
        #         "[LINTER WARNING] File does not end with a newline character. "
        #         "Adding a blank line at the end of the file is recommended (POSIX standard)."
        #     )

        if re.search(r"\{\s*\}", input_text):
            self.warnings.append(
                "[LINTER WARNING] Empty code block '{ }' detected. "
                "This might be incomplete test logic."
            )

        for i, line in enumerate(lines):
            line_num = i + 1

            if line.endswith(" ") or line.endswith("\t"):
                self.warnings.append(
                    f"[LINTER WARNING] Line {line_num}: Invisible trailing whitespace detected. This will be automaticly ignored!"
                )

            stripped = line.strip()
            if stripped.endswith("SPACE") or stripped.endswith("' '"):
                warning_msg = (
                    f"[LINTER WARNING] Line {line_num}: Explicit trailing space requested ('{stripped}').\n"
                    f"  -> Tip: The NOPE judger automatically ignores/strips trailing spaces when reading input.\n"
                    f"  -> Expecting a strict match for a space at the end of output will likely cause an unexpected match failure."
                )
                self.warnings.append(warning_msg)

            rep_match = re.search(r"REP\s*\(\s*(\d{6,})\s*(?:,.*)?\)", line)
            if rep_match:
                self.warnings.append(
                    f"[LINTER WARNING] Line {line_num}: Very large loop boundary ({rep_match.group(1)}). "
                    f"This might cause a Time Limit Exceeded (TLE) in the judger."
                )

        return self.warnings
