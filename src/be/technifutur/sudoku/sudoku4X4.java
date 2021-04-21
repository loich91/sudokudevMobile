package be.technifutur.sudoku;

public class sudoku4X4 implements Sudoku  {

    private char [][] sudoku4;
public sudoku4X4(){
    this.sudoku4 = new char [4][4];
    for(int l=0; l < sudoku4.length;l++){
        for (int c=0; c < sudoku4[l].length;c++){
            this.sudoku4[l][c]=empty;
        }
    }
}
public void afficher(){
    for(int l=0; l < sudoku4.length;l++){

        for (int c=0; c< sudoku4.length;c++){
            System.out.print(sudoku4[l][c]);
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
