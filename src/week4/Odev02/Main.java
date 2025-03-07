package week4.Odev02;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount1 = new CheckingAccount("Enes",10000);
        SavingAccount savingAccount1 = new SavingAccount("Ahmet",20000);

        checkingAccount1.calculateInterest();
        savingAccount1.calculateInterest();



    }
}
