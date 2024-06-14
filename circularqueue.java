public class circularqueue {
    private static final int DEFULT_SIZE = 10;
    protected int[] data;

    // front is responible for remove element.when remove the element front
    // increment by 1.
    // end is responible for add element.when add the element add increment by 1.
    // when add element than size++ and when remove size--.
    protected int front = 0, end = 0, size = 0;

    // Constructor to create a queue of given size. If the size is not specified
    // then it will be defult 10
    public circularqueue() {
        this(DEFULT_SIZE);
    }

    public circularqueue(int Size) {
        this.data = new int[Size];
    }

    public boolean isfull() {
        return size == data.length;
    }

    public boolean isempty() {
        return size == 0;
    }

    public boolean insert(int n) {
        if (isfull()) {
            System.out.println("circularqueue is full");
            return false;
        }
        data[end++] = n;
        end %= data.length;// wrap around
        size++;
        return true;
    }

    public int remove() throws customexception {
        if (isempty()) {
            throw new customexception("Stack is empty");
        }
        int remove = data[front++];
        front = front % data.length;// wrap around
        size--;
        return remove;
    }

    public void display() {
        if (isempty()) {
            System.out.println("CircularQueue is Empty!");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + "->");
            i++;
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws customexception {
        circularqueue cq = new circularqueue(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.display();
        System.out.println(cq.remove());
        cq.insert(122);
        cq.display();
    }
}
