class BankAccount{
    private double balance;

    void deposit(double balance){
        
    }

    void displayBalance(){
        System.out.println("Balance " + balance);

    }
}


public class Encapsulation {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.balance = 1000;

    }
    
}
