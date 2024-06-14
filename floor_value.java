class Floorvalue {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int t = 7;
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (a[mid] == t) {
                System.out.println(a[mid]);
                return;
            } else if (t > a[mid]) {
                s = mid + 1;
            } else if (t < a[mid]) {
                e = mid - 1;
            }
        }
        System.out.println(a[e]);
    }
}

// for descding order

// class Floorvalue {
// public static void main(String[] args) {
// int []a={9,8,6,4,3,2,1};
// int t=7;
// int s=0;
// int e=a.length-1;
// while(s<e){
// int mid=(s+e)/2;
// if(a[mid]==t){
// System.out.println(a[mid]);
// return;
// }
// else if(t>a[mid]){
// e=mid-1;
// }
// else if(t<a[mid]){
// s=mid+1;
// }
// }
// System.out.println(a[e]);
// }
// }