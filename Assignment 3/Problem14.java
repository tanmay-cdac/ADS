package Assignment3;

public class Problem14 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Returns height if balanced, else -1
    static int checkHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1;  // Left subtree not balanced

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // Right subtree not balanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node not balanced

        return 1 + Math.max(leftHeight, rightHeight);
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {
        // Balanced tree
        Node balancedRoot = new Node(1);
        balancedRoot.left = new Node(2);
        balancedRoot.right = new Node(3);
        balancedRoot.left.left = new Node(4);
        balancedRoot.left.right = new Node(5);

        System.out.println("Balanced tree → " + isBalanced(balancedRoot));

        // Skewed tree
        Node skewedRoot = new Node(1);
        skewedRoot.right = new Node(2);
        skewedRoot.right.right = new Node(3);
        skewedRoot.right.right.right = new Node(4);

        System.out.println("Skewed tree → " + isBalanced(skewedRoot));
    }
}

