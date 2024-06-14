public class backtraking {

    public static void printpermutation(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i < up.length(); i++) {
            char curr = up.charAt(i);
            String newstr = up.substring(0, i) + up.substring(i + 1);
            printpermutation(newstr, p + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, " ");
    }
}
