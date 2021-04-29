package be.technifutur.sudoku;

public class cell extends ValueSet{
    private char valeur=Sudoku.empty;
    private boolean disponible=true;
    private ValueSet ligne;
    private ValueSet colonne;
    private ValueSet carre;

    public void setLigne(ValueSet ligne) {
        this.ligne = ligne;
    }

    public ValueSet getLigne() {
        return ligne;
    }

    public void setColumn(ValueSet column) {
        this.colonne = column;
    }

    public ValueSet getColumn() {
        return colonne;
    }

    public void setCarre(ValueSet carre) {
        this.carre = carre;
    }

    public ValueSet getCarre() {
        return carre;
    }


    public void setValeur(char valeur) {
        if(disponible){

               this.valeur = valeur;
           }

    }

    public char getValeur() {
        return valeur;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
