package be.technifutur.sudoku;

import java.util.Arrays;

public class main {
        public static void main(String[] args){
            sudoku4X4 jeu = new sudoku4X4();
            sudoku9X9 jeu1= new sudoku9X9();
            jeu.afficher();
            System.out.println();
            jeu1.afficher();
        }

}
