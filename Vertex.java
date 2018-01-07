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

    public void addAdj(int idx) {
        if(!adj.contains(idx)) {
            adj.add(idx);
        }
    }

    public void concatAdj(Vertex b){
        ArrayList<Integer> ab = b.getAdj();
        Iterator<Integer> itr3 = ab.iterator();
        while (itr3.hasNext()) {
            Integer x = itr3.next();
            if(!adj.contains(x)) {
                addAdj(new Integer(x));
                System.out.println(toString() + x);
            }
        }
    }

    public ArrayList<Integer> getAdj() {
        return this.adj;
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