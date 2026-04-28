public class alternateNumber{
    public static void  alter(int a[]){
        for(int n=0;n<=a.length;n=n+2){
            System.out.print(a[n] + " ");

        }


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        alter(a);
        
    }
}