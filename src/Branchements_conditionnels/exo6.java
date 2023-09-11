package Branchements_conditionnels;

public class exo6 {
    public static void main(String[] args) {
        //Déterminez si la valeur d'une année est bissextile ou non. Une année est bissextile si
        //elle satisfait une de ces 2 conditions (l’une OU l’autre) :
        //– L’année est divisible par 4 ET NON divisible par 100
        //– L’année est divisible par 400

        int year = 2023;

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("L'année est bissextile");
        } else {
            System.out.println("l'année n'est pas bissextile");
        }
    }
}
