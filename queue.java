// queue using one pointer ptr.

public class queue {
    private static final int DEFULT_SIZE = 10;
    protected int[] data;
    static int ptr = -1;

    queue() {
        this(DEFULT_SIZE);
    }

    public queue(int Size) {
        this.data = new int[Size];
    }

    public boolean insert(int n) {
        if (isfull()) {
            System.out.println("queue is full");
            return false;
        }
        data[++ptr] = n;
        return true;
    }

    public int remove() throws customexception {
        if (isempty()) {
            throw new customexception("Stack is empty");
        }
        int remove = data[0];
        // element shifted to required.
        for (int i = 0; i < ptr; ++i) {
            data[i] = data[i + 1];
        }
        return remove;
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isempty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws customexception {
        queue q = new queue(5);
        q.insert(5);
        q.insert(4);
        q.insert(3);
        q.insert(2);
        q.insert(1);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
