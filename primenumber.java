public class primenumber {
    public static void main(String[] args) {
        // for(int j=1;j<=40;j++){
        int n = 1;// number to check if it is prime or not.
        int prime = 0;
        if (n == 0 || n == 1) {
            System.out.println("not prime");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                prime = 1;
                break;
            }
        }
        if (prime == 0) {
            System.out.println("prime");
        }
    }
}
// }
