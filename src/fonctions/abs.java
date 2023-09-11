package fonctions;

public class abs {
    public static void main(String[] args) {
        //Fonction « abs » : 1 entier en paramètre, 1 entier en sortie
        //– Valeur absolue d’un nombre
        //– Exemple : abs(-5) retourne le résultat 5
        System.out.println(abs(9));
    }

    public static int abs(int number){
        if (number < 0){
            return number * -1;
        }
        return number;
    }
}
