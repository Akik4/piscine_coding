package fonctions;

public class leapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
    }

    /**
     * Check if the provided year is leap
     * ● Fonction « isLeapYear » : 1 entier en paramètre, 1 booléen en sortie
     * – Vérifie qu’une année passée en paramètre est bissextile
     * – Exemple : isLeapYear (2020) retourne le résultat vrai
     * – Exemple : isLeapYear (2021) retourne le résultat faux
     * @param year
     * @return boolean
     */
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }
        return false;
    }
}
