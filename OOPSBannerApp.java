public class OOPSBannerApp {

    // Inner class to store character and its pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create patterns for O, P, S
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[3];

        maps[0] = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                " ****  ",
                "*    * ",
                "*    * ",
                " ****  ",
                "*      ",
                "*      ",
                "*      "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return maps;
    }

    // Find pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // Print banner
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int line = 0; line < height; line++) {

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, maps);

                System.out.print(pattern[line] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}