import java.util.Scanner;
public class avg {
    public static int avg(int num1, int num2,int num3)
    {
        int c=(num1+num2+num3)/3;
        return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the secound number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3=sc.nextInt();
        int avgno=avg(num1,num2,num3);
        System.out.println(avgno);




    }
    
}
