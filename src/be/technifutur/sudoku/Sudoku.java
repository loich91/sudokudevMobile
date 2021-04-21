package be.technifutur.sudoku;

public abstract interface Sudoku {


    void addValue();

    Character getValue();

    Boolean isValueValid();

    Boolean isCellValid();

}
