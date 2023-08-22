class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class task3_1 {
    public static void printList(Node head) {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }


    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printList(head);
        head = reverseList(head);
        printList(head);
    }
}

