package week4.Odev03.AbstractDemo02;

public class Food extends Product{

    double calorie;

    public Food(String name, double price, double calorie) {
        super(name, price);
    }
    @Override
    double calculateTax() {
        tax = price*0.08;
        return tax;
    }
}
