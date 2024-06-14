import java.util.Arrays;

import java.util.ArrayList;

public class misingvaluefromarray {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Original Array:");
        for (var a : arr) {
            System.out.println(a);
        }
        System.out.println("missing value in array:");
        missingvalue(arr);
    }

    @SuppressWarnings("unused")
    static void missingvalue(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int n = array.length;
        while (i < n) {
            int correctpos = array[i] - 1;
            if (array[i] != array[correctpos]) {
                int temp = array[i];
                array[i] = array[correctpos];
                array[correctpos] = temp;
            } else {
                i++;
            }
        }
        System.out.println("After sort :  ");
        System.out.print(Arrays.toString(array));
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index + 1) {
                list.add(index + 1);
            }
        }

        for (int list1 : list) {
            System.out.println(list);
        }

    }

}
