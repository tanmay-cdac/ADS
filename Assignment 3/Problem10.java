package Assignment3;

public class Problem10 {
    // Insert a node into BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key); // Create new node if root is null
        }

        if (key < root.data) {
            root.left = insert(root.left, key); // Insert in left subtree
        } else if (key > root.data) {
            root.right = insert(root.right, key); // Insert in right subtree
        }
        // If key == root.data, do nothing (no duplicates in BST)
        return root;
    }

    // Inorder traversal: Left -> Root -> Right
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] keys = {50, 30, 20, 40, 70, 60, 80};

        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
    }
}
