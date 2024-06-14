/* hashset is a most importent data structure in java
 * in hashset all operation like 
 * add:O(1)
 * search:o(1)
 * delete:o(1)
 * it only allow unique value.
 * set is unordered datastructre.
 * for traversal provide itrator class.
*/

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); // already present so not added to the set
        System.out.println(set);
        System.out.println(set.contains(1));// returns true if element is there or false otherwise
        System.out.println(set.size());
        set.remove(1);
        System.out.println(set);

        java.util.Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
