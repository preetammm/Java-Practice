import java.util.Scanner;
public class factorial {
    public static int fact(int num){
        int mul=1;
        if (num !=0){
            for(int n=1;n<=num;n++)
            {
                mul=mul*n;
            }
            return mul;
        }
        else if (num==0)
        {
            return 0;
        }
        else{
            return 404;
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int c=fact(num);
        System.out.println(c);



    }
    
}
