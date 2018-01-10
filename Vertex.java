import java.util.*;

class Vertex {
    public String label;
    private ArrayList<Vertex> adj;
    public Word content;
    public int d;

    public Vertex(Word w) {
        this.label = w.toString();
        this.adj = new ArrayList<Vertex>();
        this.content = w;
    }

    public void addAdj(Vertex idx) {
        if(!adj.contains(idx)) {
            adj.add(idx);
        }
    }

    public void setDist(int n){
        this.d = n;
    }

    public void concatAdj(Vertex b){
        ArrayList<Vertex> ab = b.getAdj();
        Iterator<Vertex> itr3 = ab.iterator();
        while (itr3.hasNext()) {
            Vertex x = itr3.next();
            if(!adj.contains(x)) {
                addAdj(x);
                System.out.println(toString() + x);
            }
        }
    }

    public ArrayList<Vertex> getAdj() {
        return this.adj;
    }

    public Vertex[] getAdjArray(){
        Vertex adjList[] = new Vertex[adj.size()];
        Iterator<Vertex> itr = adj.iterator();
        int i = 0;
        while (itr.hasNext()) {
            adjList[i] = itr.next();
        }
        return adjList;
    }

    public boolean hasAdj(Vertex a) {
        Iterator<Vertex> itr = adj.iterator();
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