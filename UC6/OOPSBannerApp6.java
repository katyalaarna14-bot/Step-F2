public class OOPSBannerApp6 {


    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }

   
    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };
    }

    public static void main(String[] args) {

        String[] lines = new String[7];

        String[] OPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        
        for (int i = 0; i < lines.length; i++) {
            lines[i] = OPattern[i] + "  " + OPattern[i] + "  " + pPattern[i] + "  " + sPattern[i];
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}