
//Main class
public class ClassObjectExample { 
    public static void main(String[] args){
        System.out.println("This is a class and object example");
        System.out.println("Creating first car object");

        //Creating objects for the class Car
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.gears = 6;
        myCar.model = "GTR";
        myCar.color = "Midnight Purple";
        myCar.display();

        System.out.println();
        System.out.println("Creating second car object");
        Car myCar2 = new Car();
        myCar2.speed = 250;
        myCar2.gears = 5;
        myCar2.model = "Mustang";
        myCar2.color = "Red";

        myCar2.display();
    }
}
//Creating class to define the properties of the car
class Car{                            
    // declaring variables
    int speed;                        
    int gears;
    String model;
    String color;

    //Creating methods
    void increaseSpeed(){             
        speed += 20;
    }
    //Creating a method to display the details of the car
    void display(){                   
        System.out.println("Speed: " + speed + "km/hr");
        System.out.println("Gears: " + gears);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

