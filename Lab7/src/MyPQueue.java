public class MyPQueue {
    MyminHeap myminHeap = new MyminHeap();

    public void enqueue(int d) {
        myminHeap.insert(d);
    }

    public int dequeue() {
        return myminHeap.remove();
    }

    public int front() {
        return myminHeap.peek();
    }

    public boolean isFull() {
        return myminHeap.isFull();
    }

    public boolean isEmpty() {
        return myminHeap.isEmpty();
    }

    public String toString() {
        return myminHeap.toString();
    }
}
