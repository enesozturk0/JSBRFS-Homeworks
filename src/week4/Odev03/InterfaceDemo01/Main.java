package week4.Odev03.InterfaceDemo01;

public class Main {

    public static void main(String[] args) {

        PaymentMethod cashPayment = new CashPayment();
        cashPayment.pay();
        PaymentMethod CreditCardPayment = new CreditCardPayment();
        CreditCardPayment.pay();

    }
}
