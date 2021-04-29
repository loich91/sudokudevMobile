package be.technifutur.sudoku;

public class sudoku4X4Vue implements SudokuVue {


    private String sudo4X4=(""+
            "|------|------|\n"+
            "|  . . | . .  |\n"+
            "|  . . | . .  |\n"+
            "|------|------|\n"+
            "|  . . | . .  |\n"+
            "|  . . | . .  |\n"+
            "|------|------|\n").replace(".","%s");
private sudoku4X4 jeu;

    public void setSudo (sudoku4X4 jeu) {
        this.jeu = jeu;
    }

    @Override
    public Sudoku getSudo() {
        return this.jeu;
    }

    @Override
    public String toString(){
        Character[] tab = new Character[16];
        int pos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                char value = jeu.getValue(i, j);
                if (value == Sudoku.empty) {
                    tab[pos] = '.';
                } else {
                    tab[pos] = value;
                }
                pos++;
            }
        }
        return String.format(sudo4X4, (Object[]) tab);
    }
}
