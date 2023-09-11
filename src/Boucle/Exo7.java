package Boucle;

public class Exo7 {
    public static void main(String[] args) {
        //Affichez le miroir d'une String (ex : pour une valeur de "Coding", affichez "gnidoC")

        String word = "Bonjour";

        for (int i = word.length()-1; i > -1; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
