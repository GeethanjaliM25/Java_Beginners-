public class Queue {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head, end;

    // Add element to Queue
    public void push(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            end.next = node;
        }

        end = node;
    }

    // Remove element from Queue
    public int pop() {

        if (head == null) {
            System.out.println("Queue is empty");
        } else {

            Node curr = head;
            head = head.next;
            curr.next = null;

            // If queue becomes empty
            if (head == null) {
                end = null;
            }

            return curr.data;
        }

        return 0;
    }

    public static void main(String[] args) {

        Queue que = new Queue();

        que.push(10);
        que.push(20);
        que.push(30);

        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());

        que.pop();
    }
}
