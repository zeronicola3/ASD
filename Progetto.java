import java.util.*;


public class Progetto {

    public Hashtable alfabeto = new Hashtable(255);
    private final char blank = ' ';

    public Progetto(String t) {
        char char_t[] = t.toCharArray();
        int c;
        for(int i=0; i<char_t.length; i++){
            if(char_t[i] != blank) {
                c = (int) char_t[i];
                if(alfabeto.get(c) == 0) {
                    alfabeto.put(c, 1);
                    System.out.println( char_t[i] );
                }
            }
        }
    }

    private void addAlfabeto() {

    }

        
    public static void main(String args[]) {

        Word ara = new Word("ciao mario ");
        Word b = new Word("cimarr");

        System.out.println(Word.isGreaterThen(ara,b));

    }
}