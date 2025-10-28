package Assignment2;
public class Problem11 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insert(int n) {
        Node new_node = new Node(n);

        if (head == null) {
            head = new_node;
            return;
        }   

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
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
        Problem11 list = new Problem11();

        list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(15);

        list.insert(20);
        list.insert(25);

        System.out.print("LinkedList: ");
        list.display();
    }
}
