// when we need to insert elenent o(1) then use linklist not use Arraylist.
// not use for search because time complexity is o(n). use Arraylist.

public class LL {
    Node head = null; // point to first node.

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // node added begining.
    public void Addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add new node at last of list.
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        printlist();
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        printlist();
    }

    public void deletemiddle(String data) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node privious = null;
        // boolean isPresent = false;
        while (temp.data != data) {
            temp = temp.next;
            privious = temp;
        }
        privious.next = temp.next;
        // temp = head;
        // privious = null;
        printlist();

    }

    // reverse using loop
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node preNode = head;
        Node currentnode = head.next;
        while (currentnode != null) {
            Node nextnode = currentnode.next;
            currentnode.next = preNode;

            // update
            preNode = currentnode;
            currentnode = nextnode;
        }
        head.next = null;
        head = preNode;
    }

    // reverse using recursion

    public Node reverserecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverserecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.Addfirst("prakash");
        // list.printlist();
        list.addlast("utadiya");
        // list.printlist();
        list.Addfirst("am");
        // list.printlist();
        list.Addfirst("i");
        // list.printlist();
        // list.deletemiddle("prakash");
        list.printlist();
        System.out.println("\nReversed Linked List using loop: ");
        list.reverse();
        list.printlist();
        System.out.println("\nReversed Linked List using recursion: ");
        list.head = list.reverserecursion(list.head);
        list.printlist();

    }
}
