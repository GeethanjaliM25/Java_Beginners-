import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDemo {

    public static void main(String[] args) {

        // ---------------- QUEUE ----------------
        Queue<String> que = new LinkedList<String>();

        que.offer("Apple");
        que.offer("Banana");
        que.offer("Cherry");

        System.out.println("First element: " + que.peek());

        System.out.println("-- Queue elements");

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

        // ---------------- DEQUE ----------------
        Deque<String> dq = new LinkedList<String>();
        dq.add("Alfa");
        dq.add("Beta");
        dq.add("Gama");

        while (!dq.isEmpty())
            System.out.println(dq.pollLast());
    }
}
