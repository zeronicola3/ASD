import java.util.*;

public class MinHeap{

    List<Vertex> Q;

    public MinHeap() {
        this.Q = new ArrayList<Vertex>();
    }

    public MinHeap(List<Vertex> list) {
        this.Q = list;
        buildHeap();
    }

    public void insert(Vertex v) {

        Q.add(v);
        int i = Q.size() - 1;
        int parent = parent(i);

        while (parent != i && Q.get(i).d < Q.get(parent).d) {

            swap(i, parent);
            i = parent;
            parent = parent(i);
        }
    }

    public void buildHeap() {

        for (int i = Q.size() / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public Vertex extractMin() {

        if (Q.size() == 0) {

            throw new IllegalStateException("MinHeap is EMPTY");
        } else if (Q.size() == 1) {

            Vertex min = Q.remove(0);
            return min;
        }

        // remove the last item ,and set it as new root
        Vertex min = Q.get(0);
        Vertex lastItem = Q.remove(Q.size() - 1);
        Q.set(0, lastItem);

        // bubble-down until heap property is maintained
        minHeapify(0);

        // return min key
        return min;
    }

    private void minHeapify(int i) {

        int left = left(i);
        int right = right(i);
        int smallest = -1;

        // find the smallest key between current node and its children.
        if (left <= Q.size() - 1 && Q.get(left).d < Q.get(i).d) {
            smallest = left;
        } else {
            smallest = i;
        }

        if (right <= Q.size() - 1 && Q.get(right).d < Q.get(smallest).d) {
            smallest = right;
        }

        // if the smallest key is not the current key then bubble-down it.
        if (smallest != i) {

            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    public Vertex getMin() {

        return Q.get(0);
    }

    public boolean isEmpty() {

        return Q.size() == 0;
    }

    private int right(int i) {

        return 2 * i + 2;
    }

    private int left(int i) {

        return 2 * i + 1;
    }

    private int parent(int i) {

        if (i % 2 == 1) {
            return i / 2;
        }

        return (i - 1) / 2;
    }

    private void swap(int i, int parent) {

        Vertex temp = Q.get(parent);
        Q.set(parent, Q.get(i));
        Q.set(i, temp);
    }


}