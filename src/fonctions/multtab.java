package fonctions;

import java.util.Arrays;

public class multtab {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(displayMultTab(5)));
    }

    public static String[] displayMultTab(int number){
        String[] table = new String[1];
        for (int i = 1; i <= 10; i++) {
            table[0] += (number * i) + "\n";
            System.out.println(table[0]);
        }
        return table;
    }
}

