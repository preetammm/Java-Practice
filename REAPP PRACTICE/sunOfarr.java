import java.util.Scanner;
public class sunOfarr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        // taking input in array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //printiing an array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }


        // printing the array if there is odd element 

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]!=0){
                System.out.println(arr[i]+ "is even number ");

            }
            else{
                System.out.println(arr[i]+ "is odd number ");
            }
        }

        // sum of array 
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("Then sum of the number is: ");
        System.out.print(sum);

        
        
    }
}