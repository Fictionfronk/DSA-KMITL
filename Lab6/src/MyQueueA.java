public class MyQueueA {
    private int MAXSIZE = 100;
    private String queue[];
    private int head = 0, tail = 0;

    public MyQueueA() {
        this.queue = new String[MAXSIZE];
    }

    public void enqueue(String d) {
        queue[tail] = d;
        tail = (tail + 1) % MAXSIZE;
    }

    public String dequeue() {
        String d = queue[head];
        head = (head + 1) % MAXSIZE;
        return d;
    }

    public String front() {
        return queue[head];
    }

    public boolean isFull() {
        return ((tail + 1) % MAXSIZE) == head;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer("front");
        for (int i = 0; i<tail; i++) {
            sb.append(" --> ");
            sb.append(queue[i]);
        }
        return new String((sb));
    }
}
