package OOPS;
class student{
    String name;
     void nameStd(){    /// void do not return anything it just print the value ;
        System.out.println("The name of the student is : "+name);
    }
}

class rectangle{
    int length;
    int weadth;

    int area(){
       return length*weadth ;////int always return some value to the part from where the method is called 
    }
}

public class class_object {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Rohan";
        s1.nameStd();
        student s2=new student();
        s2.name="Mohan";
        s2.nameStd();
        rectangle r1=new rectangle();
        r1.length=20;
        r1.weadth=17;
        System.out.println(r1.area());
        

        
    }

    
}
