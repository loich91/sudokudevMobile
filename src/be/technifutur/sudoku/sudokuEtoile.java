package be.technifutur.sudoku;

public class sudokuEtoile extends sudoAbstract implements Sudoku {


    public sudokuEtoile(){
        super(21,21);
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

        return in(line, column, 0, 0, 20, 20)
                && !in(line, column, 0, 9, 5, 11)
                && !in(line, column, 9, 0, 11, 5)
                && !in(line, column, 9, 15, 11, 20)
                && !in(line, column, 15, 9, 20, 11);
    }


    private static boolean in(int x, int y, int x1, int y1, int x2, int y2) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
}
