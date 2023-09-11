package Boucle;

public class exo3 {
    public static void main(String[] args) {
        //Affichez tous les nombres multiples de 3 entre 0 et 100 par ordre croissant
        //– En utilisant une valeur d'incrément spécifique pour votre boucle

        for (int i = 0; i <= 100; i += 3) {
            System.out.println(i);
        }

        //– En utilisant une valeur d'incrément de '1' et en utilisant un branchement et l'opérateur modulo
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
