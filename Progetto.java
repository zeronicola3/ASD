import java.util.*;


public class Progetto {

    public Hashtable alfabeto = new Hashtable(255);
    private final char blank = ' ';
    private ArrayList words = new ArrayList<Word>();

    public Progetto(String t) {
        this.explodeString(t); 
    }

    public void explodeString(String str) {
        Word wi;
        int i = 0;
    
        while((i < str.length()) && (str.charAt(i) != blank)) {
            i++;
        }
        wi = new Word(str.substring(0,i));
        words.add(wi);
        System.out.println(str.substring(0,i));
        i++;

        if(i < str.length()) {
            this.explodeString(str.substring(i));        
        }   
    }
   
    public static void main(String args[]) {

        Progetto a = new Progetto("mario mare emma mirai");
        
    }
}