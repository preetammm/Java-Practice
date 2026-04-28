
import java.util.Scanner;
public class searching{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int arr[]={2,4,6,7,8,43,323,245,8,5,433,5,6,7,8,76,5434,65,4,4,7,654,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find)
            {
                System.out.println("At index "+i+" number is there ");
            }
        }
    }
}