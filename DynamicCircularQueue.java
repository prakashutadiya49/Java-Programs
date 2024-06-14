public class DynamicCircularQueue {
    private static final int DEFULT_SIZE = 10;
    protected int[] data;
    protected int front = 0, end = 0, size = 0;

    public DynamicCircularQueue() {
        this(DEFULT_SIZE);
    }

    public DynamicCircularQueue(int Size) {
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
            int[] temp = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;

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
        DynamicCircularQueue dcq = new DynamicCircularQueue(5);
        dcq.insert(1);
        dcq.insert(2);
        dcq.insert(3);
        dcq.insert(4);
        dcq.insert(5);
        dcq.insert(1);
        dcq.insert(2);
        dcq.insert(3);
        dcq.insert(4);
        dcq.insert(5);
        dcq.display();
        System.out.println(dcq.remove());
        dcq.insert(122);
        dcq.display();
    }
}
