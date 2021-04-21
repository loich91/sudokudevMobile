package be.technifutur.sudoku;

public abstract interface Sudoku {
    char empty='_';

    void addValue(int line,int column,char value);

    char getValue(int line,int column);

    boolean isValueValid(char value);

    boolean isCellValid(int line,int column);

}
