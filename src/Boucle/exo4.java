package Boucle;

public class exo4 {
    public static void main(String[] args) {
        //Calculez ab
        //
        //(a puissance b) en utilisant des multiplications successives
        //
        //– Exemple : 63
        //
        //= 6 x 6 x 6

        int number = 4;
        int power = 4;
        int base = number;

        for (int i = 0; i < power-1; i++) {
            number = number * base;
            System.out.println(number);

        }
    }
}
