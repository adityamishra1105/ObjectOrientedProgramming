
public class ConstructorExample {
    public static void main(String[] args) {
        //Using default constructor
        Person person = new Person();
        person.display();
        
        //Using parameterized constructor
        Person person2 = new Person("Aditya" , 21);
        person2.display();
    }
    
}
class Person{
    String name;
    int age;

    //Default Constructor
    Person(){
        System.out.println("Default Constructor");
        name = "Unknown";
        age = 0;
    }
    //Parameterized Constructor
    Person(String name, int age){
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}