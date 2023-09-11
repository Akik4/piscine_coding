public class exerciceB {

    public static void main(String[] args) {
        int a, b, c;
        a = 14;
        b = 10;
        c = 15;

        if (a > b && a > c) {
            System.out.println("La variable a est plus grande que la variable B et C");
        } else if (c > a && c > b){
            System.out.println("La variable c est plus grande que la variable B et A");
        }
        else {
            System.out.println("La variable b est plus grande que la variable A et C");
        }

        int timeA;
        timeA = -3*-3;

        if (timeA > 0){
            System.out.println("Le résultat de la multiplcation est positif");
        } else {
            System.out.println("Le résultat de la multiplication est négatif");
        }


        int age;
        age = 18;
        if (age >= 18){
            System.out.println("la personne est majeur");
        } else {
            System.out.println("La personne est mineur");
        }
    }
}
