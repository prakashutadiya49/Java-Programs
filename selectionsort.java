import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 67, 1, 87, 5 };
        Selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
}

// time complexity:
// best case : O(n^2) -> when the list is already sorted
// worst case : O(n^2) -> when the list is reverse sorted
// average case : O(n^2)
// space complexity : O(1) -> in-place sorting algorithm
// unstable sort
// does not handle duplicate elements
