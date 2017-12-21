import java.io.*;
import java.util.*;


class Graph {
    private Vertex[] V;
    private Adjaction adj;

    public Graph(List<Word> w) {
        int length = w.size();
        V = new Vertex[length];
        adj = new Adjaction(length);
        for(int i=0; i<length; i++) {
            V[i] = new Vertex(w.get(i));
        }

    }

    public void removeVertex() {

    }

    public String toString() {
        return Arrays.toString(V) + '\n' + adj.toString();
    }

 /*   public Vertex getVertex() {

   } */ 

  //  public Vertex

/*
    System.out.println(matrix.toString());//print empty matrix
    ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
    ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
    ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7,8,9));
    matrix.add(row1);
    matrix.add(row2);
    matrix.add(row3);
    System.out.println(matrix.toString());
*/
}