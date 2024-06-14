// print subset of given string

import java.util.ArrayList;

public class RSsubset {
    public static void main(String[] args) {
        subsetwithASCI("abc", "");
    }

    // in this function we print all subset of given string.

    static void subset(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char first = str.charAt(0);

        subset(str.substring(1), ans + first);
        subset(str.substring(1), ans);
    }

    // in this function simply return array list of subset.

    static ArrayList<String> subset1(String str, String ans) {

        if (str.isEmpty()) {
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add(ans);
            return arrList;
        }
        char first = str.charAt(0);

        ArrayList<String> left = subset1(str.substring(1), ans + first);
        ArrayList<String> right = subset1(str.substring(1), ans);
        left.addAll(right);
        return left;
    }

    // print asci value also.3 function call.

    static void subsetwithASCI(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char first = str.charAt(0);

        subsetwithASCI(str.substring(1), ans + first);
        subsetwithASCI(str.substring(1), ans);
        subsetwithASCI(str.substring(1), ans + (first + 0));

    }

}
