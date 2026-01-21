import java.util.Scanner;
public class sumodd {
    public static int sum(int num){
        int b=0;
        for(int n=1;n<=num;n++)
        {
            if(n%2!=0)
            {
                b=b+n;
            }
            
        }
        return b;
        
            
        


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(sum(num));


    }
    
}
