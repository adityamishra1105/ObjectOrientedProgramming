
public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        //accessing pvt variable via getter
        System.out.println("Current Balance: " + account.getBalance());

        account.setBalance(150000);
        System.out.println("Updated Balance: " + account.getBalance());
    }   
}
class BankAccount{
    //private data members (hidden from outside)
    private double balance;

    //constructor 
    public BankAccount(double balance){
        this.balance = balance;
    }

    //getter method to access balance
    public double getBalance(){
        return balance;
    }

    //setter method to modify balance (with validation)
    public void setBalance(double balance){
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance amount");
        }
    }
}