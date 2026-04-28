// // import java.util.Scanner;
// // public class sumodd {
// //     public static int sum(int num){
// //         int b=0;
// //         for(int n=1;n<=num;n++)
// //         {
// //             if(n%2!=0)
// //             {
// //                 b=b+n;
// //             }
            
// //         }
// //         return b;
        
            
        


// //     }
// //     public static void main(String[]args){
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter the number: ");
// //         int num=sc.nextInt();
// //         System.out.println(sum(num));


// //     }
    
// // }


// import java.util.Scanner;
// public class sunOfarr{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of element: ");
//         int size=sc.nextInt();
//         int arr[]=new int[size];

//         // taking input in array
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }

//         //printiing an array
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]+" ");
//         }


//         // printing the array if there is odd element 

//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]%2==0 && arr[i]!=0){
//                 System.out.println(arr[i]+ "is even number ");

//             }
//             else{
//                 System.out.println(arr[i]+ "is odd number ");
//             }
//         }

//         // sum of array 
//         int sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             sum=sum+arr[i];
//         }
//         System.out.print("Then sum of the number is: ");
//         System.out.print(sum);

        
        
//     }
// }

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