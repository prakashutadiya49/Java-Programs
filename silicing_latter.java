class Main{
    public static void main(String[]args){
        char []letters={'c','f','j'};
        char target='a';
        int s=0;
        int e=letters.length-1;
        int m=s+(e-s)/2;
        while(s<=e){
            if(target>letters[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        System.out.println(letters[s%letters.length]);
    }
}