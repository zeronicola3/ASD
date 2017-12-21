import java.util.*;

class Adjaction {
    private int length = 100;
    private List<Integer>[] adj;

    public Adjaction(int length) {
        this.length = length;
        adj = (ArrayList<Integer>[]) new ArrayList[length];
        for (int i = 0; i < this.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }
/*
    public void addVertex() {
        adj.add(length) = new List<Integer>();
        lenght = length + 1;
    }
*/
    public void addAdjaction(int i, int j) {
        adj[i].add(j);
    }
/*
    public void removeAdjaction(int i, int j) {
        Iterator<Integer> itr = adj[i].iterator();
        while (itr.hasNext()) {
            if (itr.next() == j) {
                itr.remove();
                return;
            }
        }
    } */
/*
    public boolean hasAdjaction(int i, int j) {
        return adj.get(i).contains(j);
    }

    public List<Integer> outerEdges(int i) {
        return adj.get(i);
    }
/*
    public List<Integer> inEdges(int i) {
        List<Integer> edges = new List<Integer>();
        for (int j = 0; j < n; j++) {
            if (adj[j].contains(i)) {
                edges.add(j);
            }
        }
        return edges;
    } */

    public String toString() {
        String r = new String();

        for(int i=0; i<adj.length; i++) {
            r = r + adj[i].toString();
        }
        return r;
    }
}