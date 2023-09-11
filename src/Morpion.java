import java.util.Arrays;
import java.util.Scanner;

public class Morpion {
    private static boolean PlayerTurn;
    private static boolean player1V, player2V, tie;

    public static void main(String[] args) {
        player1V = false;
        player2V = false;
        tie = false;
        PlayerTurn = true;
        Scanner sc = new Scanner(System.in);


        String[][] tab = new String[3][3];


        do {
            displayTab(tab);

            Turn(tab, sc);


            victoryReached(tab, "xxx");
            victoryReached(tab, "ooo");



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

        } while (!(player1V || player2V || tie));


    }

    public static void displayTab(String[][] tab){
        String displayed ="";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    displayed += tab[i][j] + " | ";
            }
            displayed += " \n ";

        }
        System.out.println(displayed);
    }
    public static void victoryReached(String[][] tab, String shape){
        if ((tab[0][0] + tab[0][1] + tab[0][2]).equals(shape) ||(tab[1][0] + tab[1][1] + tab[1][2]).equals(shape)||(tab[2][0] + tab[2][1] + tab[2][2]).equals(shape) ||
                (tab[0][0] + tab[1][0] + tab[2][0]).equals(shape) ||(tab[0][1] + tab[1][1] + tab[2][1]).equals(shape)||(tab[0][2] + tab[1][2] + tab[2][2]).equals(shape)
                || (tab[0][0] + tab[1][1] + tab[2][2]).equals(shape) || (tab[0][2] + tab[1][1] + tab[2][0]).equals(shape)){

           if(shape.equals("xxx")){
               player1V = true;
               System.out.println("P1 win");
           } else if (shape.equals("ooo")){
               player2V = true;
               System.out.println("P2 win");
           } else{
               System.out.println("Shape not recognized");
           }


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
            }
        } else {
            if (tab[r][c] != null){
                System.out.println("Case already played");
            } else{
                PlayerTurn = true;
                tab[r][c] = "o";

            }
        }
    }
}
