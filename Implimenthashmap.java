import java.util.ArrayList;
import java.util.LinkedList;

public class Implimenthashmap {

    static class Hashmap<k, v> {
        // genrics: whe we not know which type of data user enter at that time we use
        // genrics.
        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes=(k,v)pairs
        private int N; // array size
        public LinkedList<Node>[] buckets;

        @SuppressWarnings({ "unchecked", "rawtypes" })
        public Hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList();
            }
        }

        private int searchkeyLL(k key, int bi) {
            LinkedList<Node> l = buckets[bi];
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private int hashingfunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldbucket = buckets;
            buckets = new LinkedList[2 * N];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);

                }
            }
        }

        public void put(k key, v value) {
            int bi = hashingfunction(key);
            int di = searchkeyLL(key, bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2) {
                rehash();
            }
        }

        public v get(k key) {
            int bi = hashingfunction(key);
            int di = searchkeyLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node data = buckets[bi].get(di);
                return data.value;
            }
        }

        public boolean containKey(k key) {
            int bi = hashingfunction(key);
            int di = searchkeyLL(key, bi);
            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        public v remove(k key) {
            int bi = hashingfunction(key);
            int di = searchkeyLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node removeNode = buckets[bi].remove(di); // node that we want to delete
                return removeNode.value;
            }
        }

        public ArrayList<k> getkeys() {
            int bindex = N - 1;
            ArrayList<k> keys = new ArrayList<k>();
            while (bindex > 0) {
                LinkedList<Node> bucketLL = buckets[bindex];
                for (int i = 0; i < bucketLL.size(); i++) {
                    keys.add(bucketLL.get(i).key);
                }
                bindex--;
            }
            return keys;
        }

        public ArrayList<v> getvalues() {
            int bindex = N - 1;
            ArrayList<v> values = new ArrayList<v>();
            while (bindex > 0) {
                LinkedList<Node> bucketLL = buckets[bindex];
                for (int i = 0; i < bucketLL.size(); i++) {
                    values.add(bucketLL.get(i).value);
                }
                bindex--;
            }
            return values;
        }
    }

    public static void main(String[] args) {
        Hashmap<String, Integer> map = new Hashmap<>();
        map.put("india", 120);
        map.put("uk", 30);
        map.put("japan", 22);
        map.put("china", 100);
        System.out.println(map.get("uk"));
        System.out.println(map.getkeys());
        map.remove("china");
        System.out.println(map.getvalues());

    }
}
