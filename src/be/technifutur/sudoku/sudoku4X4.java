package be.technifutur.sudoku;

public class sudoku4X4 extends sudoAbstract   {
     public sudoku4X4() {
        super(4,4);
        ValueSet ligne = new ValueSet();
        ValueSet colonne = new ValueSet();
        for (int l = 0;l<4;l++){

        }
        for (int c =0; c<4;c++){

        }
     }



    @Override
    public boolean isValueValid(char value) {
        if ( value > '0' && value <= '4'){
            return true;
        }

        return false;
    }


    @Override
    public boolean isCellValid(int line,int column) {
        return line >= 0 && line < 4 && column >= 0 && column < 4;
    }
}
