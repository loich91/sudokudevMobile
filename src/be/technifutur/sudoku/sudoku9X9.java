package be.technifutur.sudoku;

public class sudoku9X9 extends sudoAbstract implements Sudoku {

    public sudoku9X9(){
        super(9,9);
            }



    @Override
    public boolean isValueValid(char value) {
        if ( value > '0' && value <= '9'){
            return true;
        }

        return false;
    }
    @Override
    public boolean isCellValid(int line,int column) {
        return line >= 0 && line < 9 && column >= 0 && column < 9;
    }
}
