public class bitonicarray {
    public static void main(String[] args) {
        int[] s = { 2, 3, 5, 7, 6, 3, 2 };
        int answer = peak(s);
        System.out.println(answer);
    }

    static int peak(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + end / 2;
            if (a[mid] < a[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return a[start];
    }
}
