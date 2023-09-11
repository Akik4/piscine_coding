package Branchements_conditionnels;

public class exo4 {
    public static void main(String[] args) {
        //Faîtes l'exercice qui affiche la mention d'un bachelier en fonction de sa note

        int note = 17;

        if (note < 10){
            System.out.println("Sans diplôme");
        } else if (note < 12){
            System.out.println("Sans mention");
        } else if (note < 15) {
            System.out.println("Mention bien");
        } else if (note < 18){
            System.out.println("Mention très bien");
        } else {
            System.out.println("Félicitation");
        }
    }
}
