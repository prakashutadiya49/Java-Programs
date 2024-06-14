public class searchRBS {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int start = 0;
        int end = arr.length - 1;
        int target = 3;
        int pivot = findpivot(arr);
        if (pivot == -1) {
            binary_search(arr, target, start, pivot);
        } else {
            binary_search(arr, target, pivot + 1, end);
        }
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + end / 2;
            // 4 case cheak
            if (mid <= end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static void binary_search(int[] a, int target, int s, int e) {
        Boolean ISASC = s < e;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (ISASC) {
                if (target > a[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else if (!ISASC) {
                if (target < a[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        // if element is not present in array
        System.out.println("Element Not Found");
    }
}