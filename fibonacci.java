import java.util.Scanner;

class Fibonacci {
   public static void main(String args[]) {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number:");
      int num = sc.nextInt();
      int no1 = 0;
      int no2 = 1;
      int sum = 0;
      for (int i = 3; i <= num; i++) {
         sum = no1 + no2;
         no1 = no2;
         no2 = sum;
      }
      System.out.println("Fibonacci series upto " + num + " terms sum are : ");
   }
}
