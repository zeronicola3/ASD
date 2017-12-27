import java.util.*;


public class Progetto {

    public Hashtable alfabeto = new Hashtable(255);
    private final char blank = ' ';
    public List<Word> words = new ArrayList<Word>();

    public List<Word> explodeString(String str) {
        Word wi;
        int i = 0;
    
        while((i < str.length()) && (str.charAt(i) != blank)) {
            i++;
        }
        wi = new Word(str.substring(0,i));
        words.add(wi);
        i++;

        if(i < str.length()) {
            this.explodeString(str.substring(i));        
        }
        return words;
    }

    public static void main(String args[]) {

        Progetto a = new Progetto();
        List<Word> ws = a.explodeString("maremma mario mare emma mirai emma mira");
        Graph G = new Graph();

        Iterator<Word> itr = ws.iterator();
        while (itr.hasNext()) {
            G.addNode(itr.next());
        }

        System.out.println(G.toString());
    }
}