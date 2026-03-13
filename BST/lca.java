package BST;

public class lca {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static int LCA(Node root, int a, int b) {
        if (a < root.data && b < root.data) {
            return LCA(root.left, a, b);
        } else if (a > root.data && b > root.data) {
            return LCA(root.right, a, b);
        } else {// jab dono ke beech me root aajayega
            return root.data;
        }
    }

    public static void main(String args[]) {
        Node root = new Node(20, null, null);
        root.left = new Node(10, null, null);
        root.right = new Node(30, null, null);
        root.left.left = new Node(5, null, null);
        root.left.right = new Node(15, null, null);
        root.right.left = new Node(25, null, null);
        root.right.right = new Node(35, null, null);
        int a = 5, b = 15;
        System.out.println("LCA of " + a + " and " + b + " is: " + LCA(root, a, b));
    }
}
