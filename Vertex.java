import java.util.*;

class Vertex {
    public String label;
    private ArrayList<Integer> adj;
    public Word content;

    public Vertex(Word w) {
        this.label = w.toString();
        this.adj = new ArrayList<Integer>();
        this.content = w;
    }

    public void addAdj(int index) {
        this.adj.add(index);
    }

    public int[] getAdjArray(){
        int adjList[] = new int[adj.size()];
        Iterator<Integer> itr = adj.iterator();
        int i = 0;
        while (itr.hasNext()) {
            adjList[i] = itr.next();
        }
        return adjList;
    }

    public boolean hasAdj(int a) {
        Iterator<Integer> itr = adj.iterator();
        while (itr.hasNext()) {
            if (itr.next() == a) {
                return true;
            }
        }
        return false;
    }

    public void removeAdj(int a) {

    }

    public String toString() {
        return label;
    }
}