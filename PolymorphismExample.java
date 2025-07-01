
public class PolymorphismExample {
    public static void main(String[] args) {
        //demonstrating compile time polymorphism (Method Overloading)
        MathOperations math = new MathOperations();
        System.out.println("Multiply 2 numbers: " + math.multiply(4, 5));
        System.out.println("Multiply 3 numbers: " + math.multiply(6, 9));
        System.out.println("Multiply doubles: " + math.multiply(3.7, 8.54));
        
        System.out.println("\n--- Runtime Polymorphism (Method Overriding) ---");

        //demonstrating runtime polymorphism (Method Overriding)
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); //calls parent class

        Animal myDog = new Dog(); //polumorphic reference
        myDog.makeSound();   // calls overridden method in dog class
        
    }
}
class MathOperations{
    //overload method w 2 parameters
    int multiply(int a, int b){
        return a * b;
    }
    //overload method w 3 parameters
    int multiply(int a, int b, int c){
        return a * b * c;
    }
    //overload method w diff data types
    double multiply(double a, double b){
        return a * b;
    }
}
class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

