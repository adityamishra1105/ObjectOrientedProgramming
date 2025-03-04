public class InheritanceExample {
    public static void main(String[] args) {
        Ford myFord = new Ford("Mustang", "GT", 350);
        myFord.Start();
        myFord.display();
    }
}
class Vehicle{
    String Name;
    String Model;
    int Power;

    Vehicle(String name, String model, int power){
        this.Name = name;
        this.Model = model;
        this.Power = power;
    }

    void Start(){
        System.out.println("Vehicle Started");
    }
}
class Ford extends Vehicle{
    int wheels = 4;

    Ford(String name, String model, int power){
        super(name, model, power);
    }
    void display(){
        System.out.println("Name: " + Name);
        System.out.println("Model: " + Model);
        System.out.println("Power: " + Power);
        System.out.println("Wheels: " + wheels);
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}