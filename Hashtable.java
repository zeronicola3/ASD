

public class Hashtable {

    private int [] table;
    private int length = 0;

    public Hashtable(int length) {
        table = new int[length];
        this.length = length;
    }

    public int get(int key) {
        return table[key];
    }

    public void put(int key, int value) {
        table[key] = value;
    }

    public void remove(int key) {
        table[key] = 0;
    }

    public int length() {
        return table.length;
    }
}