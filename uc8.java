import java.util.HashMap;

public class uc8 {

    public static void main(String[] args) {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + "  ");
            }
            System.out.println();
        }
    }
}