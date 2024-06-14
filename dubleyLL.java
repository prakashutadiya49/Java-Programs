public class dubleyLL {
    Node head = null;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public int size() {
        int size = 0;
        if (head == null) {
            return size;
        }
        if (head.next == null) {
            return size + 1;
        }
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;

        }
        return size;
    }

    public Node findmiddle(int size) {
        int c = (size / 2) + 1;
        Node temp = head;
        while (c > 1) {
            temp = temp.next;
            c--;
        }
        return temp;
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null && head.prev == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null && head.prev == null) {
            head = null;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public void deletemiddle(int data) {
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }

    public void addmiddle(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.data < data) {
            temp = temp.next;
        }
        newnode.next = temp;
        newnode.prev = temp.prev;
        temp.prev.next = newnode;
        temp.prev = newnode;

        display();
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("null");

        while (last != null) {
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        // write your code here
        dubleyLL doublylist = new dubleyLL();

        // doublylist.display();
        // doublylist.addfirst(0);
        // doublylist.display();
        // doublylist.addlast(2);
        // doublylist.display();
        // doublylist.addmiddle(1);
        // doublylist.display();
        // doublylist.deletemiddle(1);
        // doublylist.display();
        doublylist.addfirst(1);
        doublylist.addlast(2);
        doublylist.addlast(3);
        doublylist.addlast(4);
        doublylist.addlast(5);
        doublylist.addlast(6);
        doublylist.display();
        int size = doublylist.size();
        System.out.println("list size:" + size);
        Node ans = doublylist.findmiddle(doublylist.size());
        System.out.println("middle node data value:" + ans.data);

    }

}
