class Animal{
    String name="Labra";
    

    void nameOfanimal(){
        System.out.println("Name of the animal is: "+name );

    }
    

}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");

    }
}
public class inharitance {
    public static void main(String[]args){
        Dog d1=new Dog();
        d1.bark();
        d1.nameOfanimal();
    


    }
    
}
