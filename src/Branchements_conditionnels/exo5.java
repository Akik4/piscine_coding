package Branchements_conditionnels;

public class exo5 {
    public static void main(String[] args) {
        //Initialisez une variable et affichez un message si la valeur est paire ou impaire
        //– En utilisant l'opérateur modulo (%) et en utilisant les propriétés de division d'une variable entière

        int number, result;
        number = 5;
        result = number % 2;

        if(result == 0){
            System.out.println("C'est un chiffre paire");
        } else {
            System.out.println("C'est un chiffre impaire");
        }
    }
}
