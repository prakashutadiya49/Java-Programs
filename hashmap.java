import java.util.HashMap;
// use hashmap we need to store key value pairs.
// where key is unique and value is not.
//map is unorderd data structure.
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // add pair in map
        // if you add key add pair again than,
        // if it present than update otherwise add.
        map.put("india", 136);
        map.put("china", 120);
        map.put("us", 30);
        System.out.println(map);

        // search in map
        // if key is in map than get() method give coresponding value
        // else return null
        System.out.println(map.get("us"));
        System.out.println(map.get("japan"));

        // other method for search.
        // for key
        System.out.println(map.containsKey("india"));
        System.out.println(map.containsKey("japan"));
        // for value
        System.out.println(map.containsValue(120));
        System.out.println(map.containsValue(22));

        // remove pair
        map.put("japan", 20);
        map.remove("us");
        System.out.println(map);

        // replace pair
        // replce valueof given key if avilable
        map.replace("japan", 30);
        System.out.println(map);
        map.replace("japan", 30, 20);
        System.out.println(map);

        // remove pair
        map.remove("japan");
        System.out.println(map);

        // traverse map
        // first way
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }
        // second way
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "->" + map.get(key));
        }

        // clear map
        map.clear();
        System.out.println(map);

    }
}
