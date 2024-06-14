import java.util.HashMap;

public class tickithashmap {
    public static void main(String[] args) {
        HashMap<String, String> tickits = new HashMap<>();
        // Adding elements to the hash map using
        tickits.put("chennai", "bangluru");
        tickits.put("mumbai", "delhi");
        tickits.put("goa", "chennai");
        tickits.put("delhi", "goa");

        HashMap<String, String> reverse = new HashMap<>();
        for (String key : tickits.keySet()) {
            reverse.put(tickits.get(key), key);
        }

        String start = "";
        for (String key : tickits.keySet()) {
            if (!reverse.containsKey(key)) {
                start = key;
                break;
            }
        }

        while (tickits.containsKey(start)) {
            System.out.print(start + "->");
            start = tickits.get(start);
        }
        System.out.print(start);

    }
}
