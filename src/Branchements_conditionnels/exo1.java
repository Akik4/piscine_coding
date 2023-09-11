package Branchements_conditionnels;

public class exo1 {
    public static void main(String[] args) {
        // Initialisez 2 variables entières et déterminez quelle est la valeur la plus petite des 2
        //– Refaites l'exercice avec 3 variables

        int x = 5;
        int y = 3;
        int z = 20;


        if (x < y) {
            System.out.println("La valeur de x est plus petite");
        } else if (x == y){
            System.out.println("Les deux valeurs sont égales");
        }
        else {
            System.out.println("La valeur de y est plus petite");
        }


        //Trois variables

        if (z < x & z < y) {
            System.out.println("La valeur de z est plus petite");
        } else if (x < y & x < z){
            System.out.println("La valeur de x est plus petite");
        }
        else {
            System.out.println("La valeur de y est plus petite");
        }
    }
}
