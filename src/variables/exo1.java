package variables;

public class exo1 {
    public static void main(String[] args) {
        /*Manipulez des variables
        – Déclarez une variable de chaque type (entier, décimal, chaîne de caractères, booléen)
        – Initialisez vos variables avec des valeurs arbitraires
        – Affichez les valeurs de vos variables pour vérifier que votre initialisation est correcte
        – Utilisez chacun des opérateurs arithmétiques vus précédemment (+, -, *, /, %) pour modifier les
        valeurs des variables
        – Utilisez chacun des opérateurs arithmétiques pour combiner les valeurs de 2 variables et stockez le
        résultat dans une troisième variable*/

        int integer;
        float flottant;
        String str;
        boolean bool;

        integer = 2;
        flottant = 0.02f;
        str = "Chaîne de charactère";
        bool = true;

        System.out.println( integer);
        System.out.println( flottant );
        System.out.println( str );
        System.out.println( bool );

        System.out.println(integer + flottant);
        System.out.println(flottant - integer);
        System.out.println(integer * flottant);
        System.out.println(flottant / integer);
        System.out.println(flottant % integer);

        float result = flottant * integer + integer;
        System.out.println(result);
    }
}
