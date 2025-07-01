class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
}

class Car{
    int year;
    String model;
    String company;
    int bhp;

    public void moving(){
        System.out.println("The car is moving");
        System.out.println("Any else?");
    } 
    public void accelerates(){
        System.out.println("The car is accelerating");
    }

}

public class ClassExample {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";
        pen1.write();

        Car car1 = new Car();
        car1.bhp = 321;
        car1.company = "BMW";
        car1.model = "M5";
        car1.year = 2024;
        car1.moving();
        car1.accelerates();
    }
}
