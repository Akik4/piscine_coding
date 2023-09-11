package fonctions;

public class strMirror {
    public static void main(String[] args) {
        System.out.println(strMirror("Coding Factory"));
    }

    public static String strMirror(String word){
        String mirrored;
        mirrored = "";
        for (int i = word.length()-1; i > -1; i--) {
            mirrored += word.charAt(i);
        }
        return mirrored;
    }
}
