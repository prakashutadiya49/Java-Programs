
class Binarysearch {

    static void binary_search(int[] a, int target) {
        int s = 0;
        int e = a.length - 1;
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

    public static void main(String args[]) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int target = 4;
        binary_search(a, target);
        binary_search(b, target);
    }
}