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
            int c = 0;
            if(heads.size() > 0){
                for(int i=0; i<heads.size(); i++){
                    Vertex v_tmp = V.get(heads.get(i));
                    c = Word.isGreaterThen(v_tmp.content, v.content);

                    if(c == 1) {
                        v_tmp.addAdj(V.indexOf(v));
                        V.set(heads.get(i), v_tmp);
                        System.out.println(v_tmp.label + " -> " + a.toString());
                    } else {
                        //heads.add(V.indexOf(v));
                    }
                }   
            } else {
                heads.add(V.indexOf(v));
            }
        }
    }

    public void removeVertex() {

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
        return V.toString() + '\n';
    }

 /*   public Vertex getVertex() {

   } */ 

  //  public Vertex
  
}