import java.util.Scanner;
class secound{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER: ");
        int a=sc.nextInt();
        int sum=0;
        for(int n=1;n<=a;n++){
            sum=sum+n;
        }
        System.out.println(sum);

        

    }
}