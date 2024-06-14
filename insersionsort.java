import java.util.Arrays;

public class insersionsort {

   public static void InsersionSort(int []a){
    for(int i=1;i<a.length;i++){
        int temp=a[i];
        int j=i;
        while (j>0 && a[j-1]>temp) {
            a[j]=a[j-1];
            j=j-1;
        }
        a[j]=temp;
    }
   }
    public static void main(String[] args) {
        int [] a={1,6,3,9,5,9,3,0,2};
        InsersionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
