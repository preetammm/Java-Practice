package OOPS;

public class method {
    static int regno;
    static String name;

    static void output(String a,int b){
        regno=b;
        name=a;
        System.out.println("name is: "+name+ "  and the reg no is: "+regno);
       
    }
    public static void main(String[]args){
        output("Preetam",12306830);

    }
    
}


