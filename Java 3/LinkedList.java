public class LinkedList {

    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head, end;

    public void add(int data) {
        Node curr = new Node(data);

        if (head == null) {
            head = curr;
            end = curr;
        } else {
            end.next = curr;
            end = curr;
        }
    }

    public void print() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void rewmove(int data) {
        Node prev = null, curr = head;

        while (curr != null) {
            if (curr.data == data) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }

                if (curr == end) {
                    end = prev;
                }

                curr.next = null;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void insert(int data, int pos) {

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print();
        list.rewmove(20);
        list.print();

        list.insert(25, 2);
        list.insert(35, 4);
        list.print();
    }
}