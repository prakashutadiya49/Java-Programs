// skip string from given string

public class RSstring2 {
    public static void main(String[] args) {
        String str = "ababaHelloamama";
        System.out.println(skipstring(str));

    }

    static String skipstring(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("Hello")) {
            return skipstring(str.substring(5));
        } else {
            return str.charAt(0) + skipstring(str.substring(1));

        }
    }
}
