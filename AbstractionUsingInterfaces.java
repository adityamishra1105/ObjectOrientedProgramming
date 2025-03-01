// interface (fully abstract)
interface Animal {
    void makeSound();    // abstract method (no body)
}
// concrete class implementing the interface
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
public class AbstractionUsingInterfaces {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Animal myDog = new Dog(); // upcasting
        myDog.makeSound();
    }
}