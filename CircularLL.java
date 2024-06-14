public class CircularLL {
    private Node head;
    private Node tail;

    CircularLL() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            tail.next = head;
        }
        tail.next = newnode;
        tail = newnode;
        tail.next = head;
    }

    void delete(int data) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        if (temp.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if (n.data == data) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    void display() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");

    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.display();
        cll.delete(3);
        cll.display();

    }
}
