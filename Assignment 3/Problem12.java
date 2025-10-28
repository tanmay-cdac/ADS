package Assignment3;

public class Problem12 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Insert into BST
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Find minimum value
    static int findMin(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Find maximum value
    static int findMax(Node root) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public static void main(String[] args) {
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        System.out.println("Minimum in BST: " + findMin(root));
        System.out.println("Maximum in BST: " + findMax(root));
    }
}
