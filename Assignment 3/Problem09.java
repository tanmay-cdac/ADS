package Assignment3;


public class Problem09 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Print all nodes at a given level
    static void printLevel(Node root, int level) {
        if (root == null) return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    // Find height of the tree
    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Level-order traversal without queue
    static void levelOrder(Node root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Level-order Traversal :");
        levelOrder(root);
    }
}

