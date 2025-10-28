package Assignment3;



public class Problem15 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Convert sorted array to balanced BST
    static Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;  // Middle element
        Node root = new Node(arr[mid]);

        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    // Preorder traversal: Root -> Left -> Right
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Node root = sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.println("Preorder traversal of Balanced BST:");
        preorder(root);
    }
}
