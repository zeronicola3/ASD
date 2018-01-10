import java.util.*;

public class Dijkstra{

    private int d[];
    private int pi[];

    public Dijkstra(Graph G, int s) {
        ArrayList<Vertex> V = G.getV();
        d = new int[V.size()];
        pi = new int[V.size()];

        for(int i=0; i<d.length; i++) {
            d[i] = 99;
            pi[i] = null;
        }

        d[s] = 0;
    }


    public int doDijsktra(Graph G, int s) {
        int dist = 0;

        
    }
}   