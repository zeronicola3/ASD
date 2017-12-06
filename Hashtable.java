public class Hashtable {

    private static int [] table;
    private static int length = 0;

    public Hashtable(int length) {
        table = new int[length];
        this.length = length;
    }

    public static int get(int key) {
        return table[key];
    }

    public static void put(int key, int value) {
        table[key] = value;
    }

    public static void remove(int key) {
        table[key] = 0;
    }

    public static int length() {
        return table.length;
    }
}