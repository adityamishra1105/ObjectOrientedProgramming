public class StaticExample {
    public static void main(String[] args) {
        //calling the static method without creating an object
        University.showUniversity();
        
    }
}

class University{
    //static variable
    static String name = "NIET";

    //static method
    static void showUniversity(){
        System.out.println("University name: " + name);
    }
}