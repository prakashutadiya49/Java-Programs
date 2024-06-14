import java.util.Arrays;

public class RSbubblesort {
    public static void main(String[] args) {
        int arr[] = { 5, 23, 10, -7, 1, 2 };
        Bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void Bubblesort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            Bubblesort(arr, r, c + 1);
        } else {
            Bubblesort(arr, r - 1, 0);
        }
    }
}
