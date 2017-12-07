//package progetto_asd;

public class Word {

    public char word[];
    private Hashtable char_table = new Hashtable(255);
    private static int [] index;
    private static int length = 0;

    public Word(String word) {
        this.word = word.toCharArray();
        this.length = this.word.length;
        index = new int[this.length];
        int c, t_value, j = 0;

        for(int i=0; i<this.word.length; i++){
            c = (int) this.word[i];
            t_value = char_table.get(c);

            if(t_value == 0) {
                index[j] = c;
                j++;
            }

            char_table.put(c,(t_value + 1));
        }
        index[j] = -1;
    }

    public Word(char [] word) {
        this.word = word;
        this.length = this.word.length;
        index = new int[this.length];
        int c, t_value, j = 0;

        for(int i=0; i<this.word.length; i++){
            c = (int) this.word[i];
            t_value = char_table.get(c);

            if(t_value == 0) {
                index[j] = c;
                j++;
            }

            char_table.put(c,(t_value + 1));
        }
        index[j] = -1;
    }

    public static int length() {
        return length;
    }

    public static int[] getIndexArray() {
        return index;
    }

    public void setCTValue(int key, int value) {
        this.char_table.put(key,value);
    }

    public int getCTValue(int key) {
        return this.char_table.get(key);
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
    public int isGreaterThen(Word b) {
        int [] b_index;
        // BASE CASE
        // If a is the same object of b
        if(this.equals(b)) {
            return 0;
        }

        if(this.length() < b.length()) {
            return -1;
        } else {
            b_index = b.getIndexArray();
        }

        int i = 0; 
        while(b_index[i] != -1) {
            if(b.getCTValue(b_index[i]) > this.getCTValue(b_index[i])) {
                return -1;
            } 
            i++;
        }
        return 1;
    }

}