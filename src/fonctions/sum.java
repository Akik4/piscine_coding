package fonctions;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int number){
        int total;
        total = 0;
        for (int i = 1; i <=number ; i++) {
            total += i;
        }
        return total;
    }
}
