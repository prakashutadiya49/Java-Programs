public class countarrayrotation {
  public static void main(String[] args) {
    int i;
    int a[] = { 4, 5, 6, 7, 0, 1, 2 };
    int min = a[0];
    for (i = 1; i < a.length; i++) {
      if (a[i] <= min) {
        min = a[i];
      }
      System.out.println(i);
    }
  }
}