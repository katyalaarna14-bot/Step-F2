import java.util.HashMap;

public class OOPSBannerApp8 {

    public static HashMap<Character, String[]> characterPatternMap = new HashMap<>();

    public static String[] getOpattern() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    public static String[] getPpattern() {
        return new String[]{
                " ***** ",
                " *    *",
                " *    *",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        };
    }

    public static String[] getSpattern() {
        return new String[]{
                "  *****",
                " *     ",
                " *     ",
                "  **** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void initializeMap() {
        characterPatternMap.put('O', getOpattern());
        characterPatternMap.put('P', getPpattern());
        characterPatternMap.put('S', getSpattern());
    }

    public static void displayBanner(String message) {

        int height = characterPatternMap.get('O').length;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = characterPatternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "   ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializeMap();

        String message = "OOPS"; 

        displayBanner(message);
    }
}