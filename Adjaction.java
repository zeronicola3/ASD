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

    public boolean hasAdjaction(int i, int j) {
        Iterator<Integer> itr = adj[i].iterator();
        while (itr.hasNext()) {
            if (itr.next() == j) {
                return true;
            }
        }
        return false;
    }

    public boolean hasInnerEdges(int i) {
        for(int j=0; j<this.length; j++) {
            if(j==i) {
                continue;
            } else if(hasAdjaction(j, i)) {
                return false;   
            }
        }
        return true;
    }
/*
    public List<Integer> outerEdges(int i) {
        return adj.get(i);
    }

    public List<Integer> inEdges(int i) {
        ArrayList<Integer> edges = new ArrayList<Integer>();
        for (int j = 0; j < this.length; j++) {
            if (adj[j].contains(i)) {
                edges.add(j);
            }
        }
        return edges;
    }
*/
    public String toString() {
        String r = new String();

        for(int i=0; i<adj.length; i++) {
            r = r + adj[i].toString();
        }
        return r;
    }
}