// skip character from giben string.

public class RSstring {
    public static void main(String[] args) {
        String str = "ababababccsdsd";
        System.out.println("Original String: " + str);
        System.out.print("String without a: ");
        System.out.println(answer(str, ""));
    }

    static String answer(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return answer(str.substring(1), ans);
        } else {
            return answer(str.substring(1), ans + ch);
        }
    }
}
