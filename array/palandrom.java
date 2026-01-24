package array;

public class palandrom {
    public static void main(String[]args){
    StringBuilder a=new StringBuilder("lol");
    StringBuilder b=new StringBuilder(a);
    System.out.println(b);
    b.reverse();
    System.out.println(b);
    if (a==b)
    {
        System.out.println("palandrom");
    }
    else{
        System.out.println("no palandrom");
    }

    
}
}
