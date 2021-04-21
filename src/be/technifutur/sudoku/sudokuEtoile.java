package be.technifutur.sudoku;

public class sudokuEtoile implements Sudoku {

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
