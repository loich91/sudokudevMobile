package be.technifutur.sudoku;

import java.util.Arrays;

public class main {
        public static void main(String[] args){
/*
            sudoku4X4 partie = new sudoku4X4();
            sudoku4X4Vue vue = new sudoku4X4Vue();
            SudokuControleur controleur = new SudokuControleur();
*/
            sudoku4X4 partie1 = new sudoku4X4();
            sudoku4X4Vue vue1 = new sudoku4X4Vue();
            SudokuControleur controleur1 = new SudokuControleur();


/*
            vue.setSudo(partie);
            controleur.setPartie(partie);
            controleur.setVue(vue);

            controleur.start();
*/


            vue1.setSudo(partie1);
            controleur1.setPartie(partie1);
            controleur1.setVue(vue1);

            controleur1.start();
        }

}
