// odd even number using bitwise oprater

// public class bitwiseoprator {
// public static void main(String[] args) {
// int n=100;
// System.out.println(isodd(n));
// }
// public static boolean isodd(int n){
// return (n&1)==1;
// }
// }

// unique number in array
// public class bitwiseoprator{
// public static void main(String[] args) {
// int a[]={2,3,4,1,2,1,3,6,4};
// int ans=findunique(a);
// System.out.println(ans);
// }
// public static int findunique(int []a){
// int unique=0;
// for(int n:a){
// unique^=n;
// }
// return unique;
// }
// }

// find number of bit in number N fir base B

// public class bitwiseoprator {
// public static void main(String[] args) {
// double number=1234567;
// double base=10;

// int answer=(int) ((Math.log(number)/Math.log(base))+1);
// System.out.println(answer);
// }
// }

// sum of nth row of pascal triangle
// public class bitwiseoprator{
// public static void main(String[] args) {
// int row=3; // row number of pascal triangle
// System.out.println("some of given row:");
// int answer=1<<(row-1);
// System.out.println(answer);
// ; }
// }

// given number is power of two or not.
// public class bitwiseoprator{
// public static void main(String[] args) {
// int n=123;
// int temp=n&(n-1);
// if(temp==0){
// System.out.println("yes it is power of 2");
// }
// else{
// System.out.println("no,it is not power of 2");
// }
// }
// }

// calculate a power b.

// public class bitwiseoprator {
// public static void main(String[] args) {
// int base=3;
// int power=6;

// int answer=1;
// while(power>0){
// if((power&1)==1){
// answer*=base;
// }
// base *= base;
// power=power>>1;
// }

// System.out.println(answer);
// }
// }
