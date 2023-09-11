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


    }
}
