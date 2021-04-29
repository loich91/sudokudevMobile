package be.technifutur.sudoku;

public class sudoku9X9Vue implements SudokuVue  {
    private String sudo9X9=(""+
            "|--------|-------|-------|\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|--------|-------|-------|\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|--------|-------|-------|\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|  . . . | . . . | . . . |\n"+
            "|--------|-------|-------|\n").replace(".","%s");
    private sudoku9X9 jeu;

    public void setSudo (sudoku9X9 jeu) {
        this.jeu = jeu;
    }

    @Override
    public Sudoku getSudo() {
        return this.jeu;
    }

    @Override
    public String toString(){
        Character[] tab = new Character[81];
        int pos = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = jeu.getValue(i, j);
                if (value == Sudoku.empty) {
                    tab[pos] = '.';
                } else {
                    tab[pos] = value;
                }
                pos++;
            }
        }
        return String.format(sudo9X9, (Object[]) tab);
    }
}

