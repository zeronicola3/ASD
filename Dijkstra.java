import java.util.*;

public class Dijkstra{

    public Dijkstra(Graph G, Vertex s) {
        List<Vertex> V = G.getV();
        Vertex n;
        Iterator<Vertex> itr = V.iterator();
        while (itr.hasNext()) {
            n = itr.next();
            n.setDist(99);
        }

        s.setDist(0);
    }


    public void doDijsktra(Graph G, Vertex s) {
        int dist = 0;

        MinHeap Q = new MinHeap(G.getV());

        while(!Q.isEmpty()) {
            Vertex u = Q.extractMin();
            dist += u.d;

            ArrayList<Vertex> adj = u.getAdj();
            Iterator<Vertex> itr = adj.iterator();
            while (itr.hasNext()) {
                relaxVertex(u,itr.next());
            }
        }
    }

    private void relaxVertex(Vertex u, Vertex v) {
        int weight = -1;

        if(v.d > (u.d + weight)) {
            v.d = u.d + weight;
            System.out.println(v.d);
        }
    }
}   