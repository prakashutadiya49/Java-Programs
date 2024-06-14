import java.util.Arrays;

public class RSselectionsort {
    public static void main(String[] args) {
        int[] a = { 4, 2, 9, 6, 5 };
        Selectionsort(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }

    static void Selectionsort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                Selectionsort(arr, r, c + 1, c);
            }
            Selectionsort(arr, r, c + 1, max);
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            Selectionsort(arr, r - 1, 0, 0);
        }
    }
}
