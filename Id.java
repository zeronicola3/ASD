public class Id {
    private static int number = 0;

    public static int getId(){
        return number;
    }

    public static int assignId() {
        return number++;
    }
}