import java.io.*;
import java.util.*;


class Graph {
    private List<Vertex> V = new ArrayList<Vertex>();
    private List<Integer> heads = new ArrayList<Integer>(); 

    public Graph() {
        
    }

    public void addNode(Word a) {
        Vertex v = new Vertex(a);
        if(!hasNode(v)){
            V.add(v);
            System.out.println("Nodo " + a.toString() + " aggiunto al grafo!");

            int c = 0, i = 0, index = 0;
            if (heads.size() > 0) {
                while (i < heads.size()) {
                    Vertex v_tmp = V.get(heads.get(i));
                    matchNodes(v_tmp, v);
                    i++;
                    //System.out.println(heads.toString());
                }
                //
            } else {
                heads.add(getVertexId(v));
            }
            /*
            int c = 0, i = 0, index = 0;
            if (heads.size() > 0) {
                while (i < heads.size()) {
                    Vertex v_tmp = V.get(heads.get(i));
                    c = Word.getParentage(v_tmp.content, v.content);

                    if (c == 0) {
                        v_tmp.addAdj(V.indexOf(v));
                        V.set(heads.get(i), v_tmp);
                        System.out.println(v_tmp.label + " -> " + a.toString());
                    } else if (c == 1) {
                        index = V.indexOf(v);
                        //v.concatAdj(v_tmp);
                        v.addAdj(V.indexOf(v_tmp));
                        V.set(index, v);
                        heads.remove(i);
                        System.out.println(a.toString() + " -> " + v_tmp.label);
                    }
                    i++;
                }
                heads.add(V.indexOf(v));
            } else {
                heads.add(V.indexOf(v));
            }
        */
        }
    }

    public List<Vertex> getV() {
        return V;
    }


    public int getVertexId(Vertex a) {
        Iterator<Vertex> itr = V.iterator();
        int i = 0;
        while (itr.hasNext()) {
            if(itr.next() == a){
                return i;
            }
            i++;
        }
        return -1;
    }

    private void matchNodes(Vertex a, Vertex b) {
        if(a == b) {
            return;
        } else {
            
        }
        int c = Word.getParentage(a.content, b.content);
        int n = 0;
        // a > b
        if (c == 0) {
            ArrayList<Integer> a_adj = a.getAdj();
            Iterator<Integer> itr1 = a_adj.iterator();

            while (itr1.hasNext()) {
                n = itr1.next();
                matchNodes(b, V.get(n));
            }
           // a.concatAdj(b);
            a.addAdj(getVertexId(b));
            
          //  V.set(getVertexId(a), a);
            System.out.println(a.toString() + " -> " + b.toString() + "  " + getVertexId(b));

        } else if (c == 1) {
        
            ArrayList<Integer> a_adj = a.getAdj();
            Iterator<Integer> itr2 = a_adj.iterator();
            while (itr2.hasNext()) {
                n = itr2.next();
                matchNodes(b, V.get(n));
            }
           // b.concatAdj(a);
            if((heads.indexOf(getVertexId(a)) != -1) && (heads.indexOf(getVertexId(b)) == -1)) {
                heads.set(heads.indexOf(getVertexId(a)), getVertexId(b));
            } else if(heads.indexOf(getVertexId(a)) != -1) {
                heads.remove(heads.indexOf(getVertexId(a)));
            } else if(heads.indexOf(getVertexId(b)) == -1) {
                heads.add(getVertexId(b));
            }
            b.addAdj(getVertexId(a));
           // b.concatAdj(a);
           // V.set(getVertexId(b), b);

           System.out.println(b.toString() + " -> " + a.toString() + "  " + getVertexId(a));
        } else if(c == -1) {

            ArrayList<Integer> a_adj = a.getAdj();
            Iterator<Integer> itr2 = a_adj.iterator();
            while (itr2.hasNext()) {
                n = itr2.next();
                matchNodes(b, V.get(n));
            }
            if (heads.indexOf(getVertexId(b)) == -1) {
                heads.add(getVertexId(b));
            }
        }
    }

    public void removeVertex() {

    }

    public void printAdj() {
        Iterator<Vertex> itr = V.iterator();
        while (itr.hasNext()) {
            Vertex v_tmp = itr.next();
            ArrayList a = v_tmp.getAdj();
            System.out.println(a.toString());
        }
    }

    public boolean hasNode(Vertex a) {
        Iterator<Vertex> itr = V.iterator();
        while (itr.hasNext()) {
            String l = itr.next().label;
            if (l.equals(a.label)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return V.toString() + '\n' + heads.toString();
    }

 /*   public Vertex getVertex() {

   } */ 

  //  public Vertex
  
}