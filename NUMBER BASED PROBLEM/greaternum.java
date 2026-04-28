import java.util.Scanner;

public class greaternum {
    public static int grater(int num1,int num2){
        if (num1<num2)
        {
            return num2;

        }
        else{
            return num1;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the number secound num: ");
        int num2=sc.nextInt();
        System.out.println("Grater number between num1 and num2 is "+grater(num1,num2));

        
    }

    
}
