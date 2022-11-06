public class MyminHeap {
    private int MAX_SIZE = 100;
    private int heap[] = new int[MAX_SIZE];
    private int size = 0;

    public void insert(int d) {
        int p = size++;
        heap[p] = d;
        int parent = (p - 1) / 2;
        while ((p > 0) && (heap[p] < heap[parent])) {
            swap(p, parent);
            p = parent;
            parent = (p - 1) / 2;
        }
    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public int remove() {
        int d = heap[0];
        heap[0] = heap[--size];
        int p = 0;
        while (true) {
            int left = 2 * p + 1;
            if (left >= size) break; // no child
            int right = 2 * p + 2;
            if (right == size) {
                if (heap[p] > heap[left])
                    swap(p, left);
                break; // no more child, nothing to do
            } else { // two child
                int q = heap[left] < heap[right] ? left : right;
                if (heap[p] > heap[q])
                    swap(p, q);
                else break;
                p = q;
            }
        }
        return d;
    }

    public int peek(){
        return heap[0];
    }

    public boolean isFull(){
        return size==MAX_SIZE;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i = 0; i < size; i++){
            sb.append(heap[i]);
            sb.append(",");
        }
        if(size < 0) sb.append(heap[size-1]);
        sb.append("]");
        return sb.toString();
    }
}
