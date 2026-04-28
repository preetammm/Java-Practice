import java.util.Scanner;
public class oddevennumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even: "+a);
        }
        else
        {
            System.out.println("The number is odd: "+a);
        }


        
    }
}