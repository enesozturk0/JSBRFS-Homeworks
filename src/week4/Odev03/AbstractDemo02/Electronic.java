package week4.Odev03.AbstractDemo02;

public class Electronic extends Product{

    String brand;


    public Electronic(String name, double price, String brand) {
        super(name, price);
    }
    @Override
    double calculateTax() {
        tax = price*0.18;
        return tax;
    }

}
