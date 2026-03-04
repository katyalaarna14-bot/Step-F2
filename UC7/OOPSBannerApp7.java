public class OOPSBannerApp7 {

    public static class CharacterPatternMap {
        public String[] pattern;
    }

    public static CharacterPatternMap getCharacterPatternMap(Character character) {
        CharacterPatternMap characterPatternMap = new CharacterPatternMap();

        switch (character) {
            case 'O', 'o' -> characterPatternMap.pattern = getOPattern();
            case 'P' -> characterPatternMap.pattern = getPPattern();
            case 'S' -> characterPatternMap.pattern = getSPattern();
            default -> characterPatternMap.pattern = null; 
        }

        return characterPatternMap;
    }

    private static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        char[] chars = {'O', 'O', 'P', 'S'};
        String[] lines = new String[7];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
        }

        for (char c : chars) {

            CharacterPatternMap map = getCharacterPatternMap(c);

            if (map.pattern == null) continue;   

            for (int i = 0; i < lines.length; i++) {
                lines[i] += map.pattern[i] + "  ";
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}