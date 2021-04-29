package be.technifutur.sudoku;

import java.util.Scanner;

public class SudokuControleur {
    Sudoku partie;
    SudokuVue vue;

    public void setPartie(Sudoku partie) {
        this.partie = partie;
    }

    public void setVue(SudokuVue vue) {
        this.vue = vue;
    }

    public void start() {
        Scanner a = new Scanner(System.in);
        String ligne;
        String column;
        String value;


        System.out.println("écrivez votre chaine de caractère 1.1.1");
        System.out.println(vue.toString());
        String User_value = a.nextLine();
        while (!User_value.equals("q")) {
            if (User_value.equals("j")) {
                partie.lock();
            } else {
                if (User_value.matches("^([0-9]{1})\\.([0-9]{1})\\.([1-9]{1})")) {

                    ligne = User_value.substring(0, 1);
                    column = User_value.substring(2, 3);
                    value = User_value.substring(4, 5);
                    int ligne1 = Integer.parseInt(ligne) - 1;
                    int column1 = Integer.parseInt(column) - 1;
                    char value1 = value.charAt(0);
                    partie.addValue(ligne1, column1, value1);

                    System.out.println(vue.toString());

                } else {
                    System.out.println("valeur incorrect, vieillez rentrez d'autre valeur");

                }
            }
            User_value = a.nextLine();
        }
    }


}
