public class BinaryTree {

    private class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    };

    private Node root;

    public void add(int data) {

        Node node = new Node(data);

        if (root == null)
            root = node;

        else {
            Node curr = root;

            while (true) {

                if (data > curr.data) {

                    if (curr.right == null) {
                        curr.right = node;
                        break;
                    }

                    curr = curr.right;
                }

                else if (data < curr.data) {

                    if (curr.left == null) {
                        curr.left = node;
                        break;
                    }

                    curr = curr.left;
                }

                else {
                    break;
                }
            }
        }
    }

    public void print() {

        System.out.println("Inorder:");
        inOrder(root);

        System.out.println();

        System.out.println("Preorder:");
        preOrder(root);

        System.out.println();

        System.out.println("Postorder:");
        postOrder(root);

        System.out.println();
    }

    public void inOrder(Node curr) {

        if (curr == null)
            return;

        inOrder(curr.left);
        System.out.print(curr.data + " ");
        inOrder(curr.right);
    }

    public void preOrder(Node curr) {

        if (curr == null)
            return;

        System.out.print(curr.data + " ");
        preOrder(curr.left);
        preOrder(curr.right);
    }

    public void postOrder(Node curr) {

        if (curr == null)
            return;

        postOrder(curr.left);
        postOrder(curr.right);
        System.out.print(curr.data + " ");
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(20);
        tree.add(27);
        tree.add(12);
        tree.add(24);

        tree.print();
    }
}