import java.util.Scanner;

class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String s=sc.next().trim().charAt(0).toUpperCase();
       System.out.println(s);
    }
}