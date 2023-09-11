package Bonus;

import java.util.Scanner;

public class Morpion {
    private static boolean PlayerTurn;
    private static boolean gameRunning, tie;

    public static void main(String[] args) {
        gameRunning = false;
        tie = false;
        PlayerTurn = true;
        Scanner sc = new Scanner(System.in);


        String[][] tab = new String[3][3];


        do {
            displayTab(tab);

            Turn(tab, sc);

        } while (!(gameRunning|| tie));


    }

    public static void displayTab(String[][] tab){
        String displayed = " ";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tab[i][j] == null){
                    displayed += "  | ";
                } else {
                    displayed += tab[i][j] + " | ";
                }
            }
            displayed += " \n ";

        }
        System.out.println(displayed);
    }

    public static void checkArround(String[][] tab, int raw, int columns, String shape) {
        for (int i = 0; i < 3; i++) {
            if (tab[1][i] == shape && tab[0][i] == shape&& tab[2][i] == shape) {
                System.out.println(shape + " win");
                gameRunning = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == shape && tab[i][1] == shape&& tab[i][2] == shape) {
                System.out.println(shape + " win");
                gameRunning = true;
            }
        }

            if (tab[1][1] != null) {
                if (tab[0][0] != null && tab[2][2] != null) {
                    if (tab[1][1].equals(shape) && tab[0][0].equals(shape) && tab[2][2].equals(shape)) {
                        System.out.println(shape + " win");
                        gameRunning = true;
                    }
                } else if (tab[0][2] != null && tab[2][0] != null) {
                    if (tab[0][2].equals(shape) && tab[0][0].equals(shape) && tab[2][0].equals(shape)) {
                        System.out.println(shape + " win");
                        gameRunning = true;
                    }
                }
            }
        int i = 0;
        for (String[] l:tab) {
            for (String sl:l){
                if(sl != null){
                    i +=1;
                }
            }
        }

        if (i == 9){
            System.out.println("Tie");
            tie = true;
        }
    }
    public static void Turn(String[][] tab,Scanner sc){
        String player;
        if(PlayerTurn){
            player = "P1";
        } else{
            player = "P2";
        }
        System.out.println(player + " Wich raw you want ?");
        int r = sc.nextInt();
        if ( r > 2 | r < 0){
            System.out.println("Please provide a number between 0 and 2");
            return;
        }
            System.out.println(player + " Wich column you want ?");
        int c = sc.nextInt();
        if (c > 2 | c < 0 ){
            System.out.println("Please provide a number between 0 and 2");
            return;
        }



        if(PlayerTurn) {
            if (tab[r][c] != null){
                System.out.println("Case already played");
            } else{
                PlayerTurn = false;
                tab[r][c] = "x";
                checkArround(tab, r, c, "x");
            }
        } else {
            if (tab[r][c] != null){
                System.out.println("Case already played");
            } else{
                PlayerTurn = true;
                tab[r][c] = "o";
                checkArround(tab, r, c, "o");

            }
        }
    }
}
