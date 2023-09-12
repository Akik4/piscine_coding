package Bonus;

import javax.swing.*;

public class test{

    public static int x = random(0, 3);
    public static int y = random(0, 3);
    static String[][] tab = new String[4][4];

    public static void main(String[] args) {
        JFrame myJFrame = new JFrame();

        myJFrame.setVisible(true);
        myJFrame.addKeyListener(new bonusB());

        tab[y][x] = "O";

        displayTab(tab);

    }

    public static void moove(int X, int Y,String[][] tab){
        if(x+X > 3 || x+X < 0) return;
        if (y+Y > 3 || y+Y < 0) return;

        tab[y][x] = "";

        tab[y+Y][x+X] = "O";
        x += X;
        y += Y;
    }


    public static void displayTab(String[][] tab){
            StringBuilder displayed = new StringBuilder(" 0 | 1 | 2 | 3 \n ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if(tab[i][j] == null){
                        displayed.append("  | ");
                    } else {
                        displayed.append(tab[i][j]).append(" | ");
                    }
                }
                displayed.append(i + " \n ");

            }
            System.out.println(displayed);
        }

        private static int random(int min, int max){

            return (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
    }
