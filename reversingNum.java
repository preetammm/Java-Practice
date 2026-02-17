import java.util.*;
public class reversingNum {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name you want to print: ");
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);  
        }
        System.out.println(rev);
        if(name.equals(rev))
        {
            System.out.println("This is palandrom: "+rev);
        }
        else{
            System.out.println("This Is Not palandrom: "+name+" is not same as "+rev);
        }

        



        
    }
}
    

