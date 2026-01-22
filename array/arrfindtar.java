//taking a output form user and print 2d array and then finding index of a cearch element;
package array;

import java.util.Scanner;

public class arrfindtar {
    
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
        System.out.println("enter the number ou want to search: ");
        int b=sc.nextInt();
        boolean a=false;
        for(int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                if(matrix[i][j]==b)
                {
                    System.out.println( i +"and"+ j);
                    a=true;
                    break;
                }
            }
        }
        if (!a){
                System.out.println("invalid input");
            }
        System.out.println();
        



    }
    
}
