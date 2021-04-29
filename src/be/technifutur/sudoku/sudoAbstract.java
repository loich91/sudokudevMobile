package be.technifutur.sudoku;

public abstract class sudoAbstract extends cell implements Sudoku {
    private cell [][] sudo;



    public sudoAbstract(int ligne,int colonne){

        this.sudo = new cell [ligne][colonne];
        for(int l=0; l < sudo.length;l++){
            for (int c=0; c < sudo[l].length;c++){
                this.sudo[l][c]=new cell();
            }
        }
    }


    @Override
    public void addValue(int line,int column,char value) {

        if (line<=sudo.length && column<=sudo.length && isValueValid(value)){

            sudo[line][column].setValeur(value);

        }
    }
    @Override
    public char getValue(int line,int column) {
        char value = empty;
        if (isCellValid(line, column)) {
         value=this.sudo[line][column].getValeur();
        }
        return value;
    }

    @Override
    public void lock() {

        for(int l=0; l < sudo.length;l++) {
            for (int c = 0; c < sudo[l].length; c++) {
                if(sudo[l][c].getValeur()!=empty){
                    sudo[l][c].setDisponible(false);
                }
            }
        }
    }
}
