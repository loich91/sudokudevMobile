package be.technifutur.sudoku;

public class sudoku9X9 implements Sudoku {
    private char [][] sudoku9;
    public sudoku9X9(){
        this.sudoku9 = new char [9][9];
        for(int l=0; l < sudoku9.length;l++){
            for (int c=0; c < sudoku9[l].length;c++){
                this.sudoku9[l][c]=empty;
            }
        }
    }
    public void afficher(){
        for(int l=0; l < sudoku9.length;l++){

            for (int c=0;c< sudoku9.length;c++){
                System.out.print(sudoku9[l][c]);
            }
            System.out.println();
        }
    }
    @Override
    public void addValue(int line,int column,char value) {
        return;
    }
    @Override
    public char getValue(int line,int column) {

        return 'a';
    }
    @Override
    public boolean isValueValid(char value) {
        return true;
    }
    @Override
    public boolean isCellValid(int line,int column) {
        return true;
    }
}
