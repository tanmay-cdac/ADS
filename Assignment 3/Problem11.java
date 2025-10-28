package Assignment3;


public class Problem11 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Insert function
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

    // Iterative search in BST
    static boolean search(Node root, int key) {
        Node current = root;

        while (current != null) {
            if (key == current.data) {
                return true;
            }
            else if (key < current.data) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        int searchKey1 = 40;
        int searchKey2 = 90;

        System.out.println(searchKey1 + " : " + (search(root, searchKey1) ? "Found" : "Not Found"));
        System.out.println(searchKey2 + " : " + (search(root, searchKey2) ? "Found" : "Not Found"));
    }
}
