package fonctions;

public class pwr {
    public static void main(String[] args) {
        System.out.println(pwr(2, 4));
    }

    public static int pwr(int number, int power){

        int base = number;

        for (int i = 0; i < power-1; i++) {
            number = number * base;
        }
        return number;
    }
}
