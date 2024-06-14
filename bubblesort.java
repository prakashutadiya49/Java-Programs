import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int array[] = { 2, 4, 67, 8, 9, 0, 3 };
        Bubblesort(array);
        System.out.println(Arrays.toString(array));
    }

    static void Bubblesort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }

            }
            if (!swap) {
                break;
            }
        }
    }
}

// time complexity:
// best case : O(n) -> when the list is already sorted
// worst case : O(n^2) -> when the list is reverse sorted
// average case : O(n^2)
// stable sort
// space complexity : O(1) - inplace sorting
// less er number moves to the beginning of the array and larger number to end
// less usage