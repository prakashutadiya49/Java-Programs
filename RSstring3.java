public class RSstring3 {
    public static void main(String[] args) {
        String up = "abc";
        System.out.println("number of permutation:" + permutation("", up));
    }

    static int permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p + " ");
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            String nw = f + ch + s;
            count = count + permutation(nw, up.substring(1));
        }
        return count;

    }
}
