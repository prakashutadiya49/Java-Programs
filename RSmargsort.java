// marge sort which create  a new array and merge the sorted subarrays into it.
// sorting is not perform in orijnal array.

import java.util.Arrays;

public class RSmargsort {
    public static void main(String[] args) {
        int[] arr = { 5, 23, 10, -7, 1, 2 };
        // System.out.println(Arrays.toString(divide(arr)));
        inplacedivide(arr, 0, arr.length);
        System.out.println(arr);
    }

    static int[] divide(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return marge(left, right);
    }

    static int[] marge(int[] left, int[] right) {
        int[] marge = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int m = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                marge[m] = left[l];
                l++;
            } else {
                marge[m] = right[r];
                r++;
            }
            m++;
        }
        while (l < left.length) {
            marge[m] = left[l];
            l++;
            m++;
        }

        while (r < right.length) {
            marge[m] = right[r];
            r++;
            m++;
        }
        return marge;

    }

    // second way inplace sorting.

    static void inplacedivide(int[] arr, int s, int e) {
        if (e - s == 1)
            return;

        int mid = s + e / 2;

        inplacedivide(arr, 0, mid);
        inplacedivide(arr, mid, e);

        inplacemarge(arr, s, mid, e);
    }

    static void inplacemarge(int[] arr, int s, int mid, int e) {
        int[] marge = new int[e - s];
        int l = s;
        int r = mid;
        int m = 0;
        while (l < mid && r < e) {
            if (arr[l] < arr[r]) {
                marge[m] = arr[l];
                l++;
            } else {
                marge[m] = arr[r];
                r++;
            }
            m++;
        }
        while (l < mid) {
            marge[m] = arr[l];
            l++;
            m++;
        }

        while (r < e) {
            marge[m] = arr[r];
            r++;
            m++;
        }

        for (int i = 0; i < marge.length; i++)
            arr[s + i] = marge[i];
    }
}
