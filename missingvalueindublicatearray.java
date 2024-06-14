import java.util.ArrayList;

public class missingvalueindublicatearray {
    public static void main(String[] args) {
        int[] array = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Original Array:");
        for (var a : array) {
            System.out.println(a);
        }
        System.out.println("missing value in array:");
        missingvalue(array);
    }

    static void missingvalue(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] - 1 != i) {
                int temp = array[array[i] - 1];
                array[array[i] - 1] = array[i];
                array[i] = temp;
            }
        }
        for (var a : array) {
            System.out.println(a);
        }
        // finding the missing number using linear search
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index + 1) {
                list.add(index);
            }
        }

        for (int list1 : list) {
            System.out.println(list1);
        }

    }
}
