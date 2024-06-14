// size of union array

import java.util.HashSet;

public class union_of_array {
    public static void main(String[] args) {
        int[] arr1 = { 5, 7, 9 };
        int[] arr2 = { 6, 1, 2, 34, 5, 6, 7, 8, 5, 4, 9, 0 };
        HashSet<Integer> union = new HashSet<>();

        for (int i : arr1) {
            union.add(i);
        }
        for (int i : arr2) {
            union.add(i);
        }
        System.out.println(union);
        System.out.print("union array size:" + union.size());
    }
}