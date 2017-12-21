import java.util.*;

class Vertex {
    private String label;
    //private int id;
    private Word content;

    public Vertex(Word w) {
        this.label = w.toString();
       // this.id = Id.assignId();
        this.content = w;
    }

    public String toString() {
        return label;
    }
}