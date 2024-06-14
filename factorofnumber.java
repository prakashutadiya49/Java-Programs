
// time complexity o(n)
// public class factorofnumber {
//     public static void main(String[] args) {
//         double n=36;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 System.out.println(i+" ");
//             }
//         }
//         System.out.println(n);
//     }
// }

// time complexity 0(sqrt(n))

import java.util.ArrayList;

public class factorofnumber {
    public static void main(String[] args) {
        double n = 50000000;
        factor(n);
    }

    static void factor(double n) {
        ArrayList<Integer> sc = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " ");
                    sc.add((int) (n / i));
                }
            }
        }
        for (int i = sc.size() - 1; i > 0; i--) {
            System.out.println(sc.get(i) + " ");
        }

    }
}
