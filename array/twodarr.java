package array;
import java.util.Scanner;
public class twodarr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println("enter number of colums: ");
        int colums=sc.nextInt();
        System.out.println("now enter the matrix you want to add: ");
        int[][]matrix=new int[rows][colums];
        for(int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("your matris is now ready");
        for(int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }


    }
    
}
