package util;

import java.io.IOException;

public class MainUtil {

    public void showTitle(String message) {
        clearTerminal();

        String[][] alphabet = new String[26][];
        alphabet['T' - 'A'] = new String[] {
                "███████",
                "   █   ",
                "   █   ",
                "   █   ",
                "   █   "
        };
        alphabet['R' - 'A'] = new String[] {
                "██████ ",
                "█    █ ",
                "█████  ",
                "█    █ ",
                "█     █"
        };
        alphabet['A' - 'A'] = new String[] {
                "  ██  ",
                " █  █ ",
                "██████",
                "█    █",
                "█    █"
        };
        alphabet['V' - 'A'] = new String[] {
                "█        █",
                " █      █ ",
                "  █    █  ",
                "   █  █   ",
                "    ██    "
        };
        alphabet['E' - 'A'] = new String[] {
                "██████ ",
                "█      ",
                "█████  ",
                "█      ",
                "██████ "
        };
        alphabet['N' - 'A'] = new String[] {
                "█    █",
                "██   █",
                "█ █  █",
                "█  █ █",
                "█   ██"
        };
        alphabet['S' - 'A'] = new String[] {
                " █████ ",
                "█      ",
                " █████ ",
                "      █",
                " █████ "
        };
        alphabet['O' - 'A'] = new String[] {
                " ████  ",
                "█    █ ",
                "█    █ ",
                "█    █ ",
                " ████  "
        };
        alphabet['L' - 'A'] = new String[] {
                "█      ",
                "█      ",
                "█      ",
                "█      ",
                "█████  "
        };

        String[] rows = new String[5];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = "";
        }

        for (char c : message.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                String[] letterArt = alphabet[c - 'A'];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] += letterArt[i] + "  ";
                }
            }
        }

        int terminalWidth = 120;

        for (String row : rows) {
            int padding = (terminalWidth - row.length()) / 2;
            System.out.println(" ".repeat(Math.max(0, padding)) + row);
        }
    }

    public void clearTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Failed to clear terminal.");
        }
    }
}
