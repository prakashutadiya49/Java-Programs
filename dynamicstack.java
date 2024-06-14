
public class dynamicstack {
    private static final int DEFULT_SIZE = 10;
    protected int[] data;
    static int ptr = -1;

    dynamicstack() {
        this(DEFULT_SIZE);
    }

    public dynamicstack(int Size) {
        this.data = new int[Size];
    }

    public boolean push(int n) {
        if (isfull()) {
            int[] temp = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = n;
        return true;
    }

    public int pop() throws customexception {
        if (isempty()) {
            throw new customexception("Stack is empty");
        }
        int x = data[ptr];
        ptr--;
        return x;
    }

    public int peek() throws customexception {
        if (isempty()) {
            throw new customexception("Stack is empty");
        }
        return data[ptr];
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isempty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws customexception {
        dynamicstack s = new dynamicstack(5);
        s.push(12);
        s.push(34);
        s.push(56);
        s.push(33);
        s.push(76);
        s.push(11);
        s.push(12);
        s.push(34);
        s.push(56);
        s.push(33);
        s.push(76);
        s.push(22);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());// printing the element
        System.out.println(s.pop());
    }
}
