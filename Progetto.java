//package progetto_asd;

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
        //Hashtable a = new Hashtable(255);
        //a.put(32,1);
        //System.out.println(a.get(31));

        //Progetto a = new Progetto("ciao mario");

        Word a = new Word("ciaomario");
        Word b = new Word("ciabama");

        System.out.println(a.isGreaterThen(b));

    }
}