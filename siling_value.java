
class siling_value {

    static int binary_search(int[] a, int target) {
        int s = 0;
        int e = a.length - 1;
        Boolean ISASC = s < e;
        while (s <= e) {
            int mid = (s + (e - s)) / 2;
            if (a[mid] == target) {
                return target;
            }
            if (ISASC) {
                if (target > a[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (target < a[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return a[s];
    }

    public static void main(String args[]) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int target = 9;
        System.out.println("target element siling value:" + binary_search(a, target));
        System.out.println("target element siling value:" + binary_search(b, target));
    }
}

// class HelloWorld {
// public static void main(String[] args) {
// int []a={1,2,3,4,5,6,8,9};
// int t=8;
// int s=0;
// int e=a.length-1;
// while(s<e){
// int mid=(s+e)/2;
// if(a[mid]==t){
// System.out.println(a[mid]);
// return;
// }
// else if(t>a[mid]){
// s=mid+1;
// }
// else if(t<a[mid]){
// e=mid-1;
// }
// }
// System.out.println(a[s]);
// }
// }