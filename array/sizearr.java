package array;
import java.util.Scanner;
public class sizearr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ender the size of array: ");
        int size=sc.nextInt();
        System.out.println("starting entering the element of size: "+size);
        int arr[]=new int[size];
        for(int n=0;n<size;n++){
            arr[n]=sc.nextInt();

        }
        for(int n=0;n<size;n++)
        {
            System.out.println("."+arr[n]);
        }

        //for finding a specific index of a number 
        System.out.println("enter the number you want to find: ");
        int find=sc.nextInt();
        boolean found=false;
        for(int n=0;n<size;n++)
        {
            if(arr[n]==find){
                System.out.println("your number "+find +" is at "+n);
                found=true;
                break;
            }
            
        }
        if (!found){
                System.out.println("invalid input");
            }
        //



    }
    
    
}
