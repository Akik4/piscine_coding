package fonctions;

public class min {

    public static void main(String[] args) {
        //● Fonction « fonctions.min » : 2 entiers en paramètres, 1 entier en sortie
        //– Valeur minimum entre 2 nombre
        //– Exemple : fonctions.min(2, 9) retourne le résultat 2
        System.out.println(Min(25, 9));
    }
    public static int Min(int x, int y){
        if (x < y){
            return x;
        } else {
            return y;
        }
    }
}
