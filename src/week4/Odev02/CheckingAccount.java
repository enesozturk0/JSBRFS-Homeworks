package week4.Odev02;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    public void calculateInterest(){
        System.out.println("Checking accounts do not earn interest.");
    }
}
