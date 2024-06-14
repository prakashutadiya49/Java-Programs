// smallest positive number not in array
// array contain positive and negative numbers

import java.util.*;

public class leetcode3 {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 11, 12 };
        System.out.println("Original Array:");
        for (var a : arr) {
            System.out.println(a);
        }
        System.out.println("missing value in array:");
        int ans = missingvalue(arr);
        System.out.println(ans);
    }

    static int missingvalue(int[] array) {
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
        int max = Math.max(array[0], array[array.length]);
        for (int j = 1; i < max; i++) {
            for (int k = 0; k < array.length; k++) {
                if (j == array[k]) {
                    continue;
                } else {
                    return j;
                }
            }
        }
        return -1;

    }

}
