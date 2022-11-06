import java.util.Scanner;
import java.util.StringTokenizer;

public class PQueueTester {
    public static void main(String[] args) {
        MyPQueue queue = new MyPQueue();
        MyPQueueF queuef = new MyPQueueF();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer t = new StringTokenizer(s);
        while (t.hasMoreTokens()){
            String token = t.nextToken();
            queue.enqueue(Integer.parseInt(token));
            queuef.enqueue(Integer.parseInt(token));
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
        System.out.println(queuef.isEmpty());
        System.out.println(queuef.front());
        System.out.println(queue.dequeue());
        System.out.println(queuef.dequeue());
    }
}
