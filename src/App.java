public class App {
    public static void main(String[] args) throws Exception {
        String[][] letter = new String[9][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 4 || i == 8) {
                    letter[i][j] = " *";
                } else if (j == 0 || j == 4) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "  ";
                }
            }
        }

        for (String[] row : letter) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
