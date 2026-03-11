public class uc7 {

    static class CharacterPatternMap {
        char letter;
        String[] pattern;

        CharacterPatternMap(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        CharacterPatternMap[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            for (CharacterPatternMap c : word) {
                System.out.print(c.pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}