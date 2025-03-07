package week4.Odev02;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    public void calculateInterest(){
        double interest = getBalance()*0.05;
        System.out.println(getAccountHolder()+ " Interest is: " + interest);
    }
}
