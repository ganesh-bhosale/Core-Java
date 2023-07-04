package Exceptions.throwsEx;

public class TestBank {
    public static void main(String [] args){
        BankAccount account = new BankAccount(100);

        try{
            account.withdraw(150);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super();
    }

    public  InsufficientFundsException(String message){
        super(message);
    }
}
class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount){
            throw new InsufficientFundsException("Insufficient Funds");
        }
        balance -= amount;
        System.out.println("Remaining Balance :" +balance);
    }
}
