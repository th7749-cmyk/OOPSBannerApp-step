public class uc6 {

    static String[] O() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    static String[] P() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    static String[] S() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[][] letters = {O(), O(), P(), S()};

        for (int i = 0; i < 7; i++) {
            for (String[] letter : letters) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}