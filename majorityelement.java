import java.util.HashMap;

public class majorityelement {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>(); // key : num, value:frequancy of num
        for (int i : nums) {
            if (map.containsKey(i)) {
                int n = map.get(i) + 1;
                map.put(i, n);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println("Majority elements");
        for (int i : map.keySet()) {
            if (map.get(i) >= nums.length / 3) {
                System.out.print(i + " ");
            }
        }
    }
}
