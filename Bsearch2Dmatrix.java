import java.util.Arrays;

public class Bsearch2Dmatrix {
    public static void main(String[] args) {
        int m[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };
        int target = 50;
        System.out.println(Arrays.toString(search(m, target)));
    }

    static int[] search(int m[][], int target) {
        int r = 0;
        int c = m.length - 1;
        while (r < m.length && c >= 0) {
            if (m[r][c] == target)
                return new int[] { r, c };
            if (target > m[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
