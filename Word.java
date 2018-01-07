import java.util.*;

public class Word {

    public char word[];
    public Hashtable char_table = new Hashtable(255); 
    private int [] index;
    private int length = 0;

    public Word(String a) {
        word = a.toCharArray();
        length = a.length();
        //char_table = new Hashtable(255);
        index = new int[length + 1];
        int c, t_value, j = 0;

        for(int i=0; i<length; i++){
            c = (int) word[i];
            t_value = getCTValue(c);

            if(t_value == 0) {
                index[j] = c;
                j++;
            }
            t_value++;
            setCTValue(c,t_value);
        }
        index[j] = -1;
    }

    public int length() {
        return this.length;
    }

    public int[] getIndexArray() {
        return index;
    }

    public void setCTValue(int key, int value) {
        char_table.put(key,value);
    }

    public int getCTValue(int key) {
        return char_table.get(key);
    }


        /**
    * Return 0 if a is equal then b, 1 if a is greater then b,
    * else -1
    *
    * @param  a  a Word istance.
    * @param  b  another Word istance.
    * @return  int (-1, 0, 1)   
    * @see         Image
    */
    public static int isGreaterThen(Word a,Word b) {
        int [] b_index;
        // BASE CASE
        // If a is the same object of b
        if(a == b) {
            return 0;
        }

        if(a.length() < b.length()) {
            return -1;
        } else {
            b_index = b.getIndexArray();
        }

        int i = 0; 
        while(b_index[i] != -1) {
            if(b.getCTValue(b_index[i]) > a.getCTValue(b_index[i])) {
                return -1;
            } 
            i++;
        }
        return 1;
    }

    public String toString() {
        return new String(word);
    }

    public static int getParentage(Word a, Word b) {
        int r = isGreaterThen(a,b);
        System.out.println(a.toString() + " vs. " + b.toString());
        if(r == 1) {
            return 0;
        } else {
            r = isGreaterThen(b,a);
            System.out.println(b.toString() + " vs. " + a.toString());
            if( r == 1) {
                return 1;
            }
        }
        return -1;
    }
}