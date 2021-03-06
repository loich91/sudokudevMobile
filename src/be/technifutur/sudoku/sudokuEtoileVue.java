package be.technifutur.sudoku;

public class sudokuEtoileVue  implements SudokuVue{
    private static String sudoEtoile = ("" +
            "+-------+-------+-------+       +-------+-------+-------+\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+       +-------+-------+-------+\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+-------+-------+-------+-------+\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+-------+-------+-------+-------+\n" +
            "                | . . . | . . . | . . . |                \n" +
            "                | . . . | . . . | . . . |                \n" +
            "                | . . . | . . . | . . . |                \n" +
            "+-------+-------+-------+-------+-------+-------+-------+\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . | . . . | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+-------+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+       +-------+-------+-------+\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |       | . . . | . . . | . . . |\n" +
            "+-------+-------+-------+       +-------+-------+-------+\n").replace(".", "%s");

    private sudokuEtoile jeu;

    public void setSudo(sudokuEtoile jeu) {
        this.jeu = jeu;
    }

    @Override
    public Sudoku getSudo() {
       return this.jeu;
    }

    public String toString() {
        Character[] tab = new Character[21 * 21  - 3 * 6 * 4];
        int pos = 0;
        for (int line = 0; line < 27; line++) {
            for (int column = 0; column < 27; column++) {
                if(jeu.isCellValid(line,column)) {
                    char value = jeu.getValue(line, column);
                    if (value == Sudoku.empty) {
                        tab[pos] = '.';
                    } else {
                        tab[pos] = value;
                    }
                    pos++;
                }else{
                    //System.out.println("l:"+line+" c:"+column);
                }
            }
        }
        return String.format(sudoEtoile, (Object[]) tab);
    }
}


