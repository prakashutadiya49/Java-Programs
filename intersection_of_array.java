import java.util.HashSet;

public class intersection_of_array {

    public static void main(String[] args) {
        int[] arr1 = { 5, 7, 9 };
        int[] arr2 = { 6, 1, 2, 34, 5, 6, 7, 8, 5, 4, 9, 0 };
        HashSet<Integer> intersection = new HashSet<>();

        for (int i : arr1) {
            intersection.add(i);
        }
        int count = 0;
        for (int j : arr2) {
            if (intersection.contains(j)) {
                count++;
                intersection.remove(j);
            }
        }
        System.out.print("intersection array size:" + count);
    }
}
