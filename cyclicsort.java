import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        // array range must ne 1...N
        int arr[] = { 7, 6, 5, 4, 3, 1, 2 };
        Cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclicsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
