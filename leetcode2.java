
// missing number and new number in the place of missing number.
import java.util.Arrays;

import java.util.ArrayList;

public class leetcode2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println("Original Array:");
        for (var a : arr) {
            System.out.println(a);
        }
        System.out.println("missing value in array:");
        missingvalue(arr);
    }

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
                list.add(array[index]);
                list.add(index + 1);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
            list.add(-1);
        }
        for (@SuppressWarnings("unused")
        int list1 : list) {
            System.out.println(list);
        }

    }

}
