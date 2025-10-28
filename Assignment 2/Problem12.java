package Assignment2;
public class Problem12 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertBegin(int n) {
        Node new_node = new Node(n);
        new_node.next = head;
        head = new_node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Problem12 list = new Problem12();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.insertBegin(5);
        System.out.print("LinkedList: ");
        list.display();
    }
}
