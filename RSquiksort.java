import java.util.Arrays;

public class RSquiksort {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 8, 0, 3, 2, 4, 6, 7, 9, 3 };
        quiksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quiksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int pivit = arr[start];

        while (start < end) {

            // this loop find cheak element is less than pivit or not.
            // if yes than cheak for next element
            // other wise stop increment of arr[start] and swap with arr[end] if start and
            // end not cross each other.
            while (arr[start] < pivit) {
                start++;
            }
            // this loop find cheak element is grater than pivit or not.
            // if yes than cheak for next element
            // other wise stop increment of arr[end] and swap with arr[start] if start and
            // end not cross each other.
            while (arr[end] > pivit) {
                end--;
            }

            // actual swaping done. and incrment start and dicriment end until start<=end
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // if start and end cross each other than cheak for left side of pivit and
        // right side of pivit.

        quiksort(arr, low, end);
        quiksort(arr, start, high);
    }

}
// time complxity
// worst case:o(n^2)
// best case:o(n*logn)