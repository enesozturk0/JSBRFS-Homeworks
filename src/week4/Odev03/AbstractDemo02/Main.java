package week4.Odev03.AbstractDemo02;

public class Main {
    public static void main(String[] args) {

        Product electronic1 = new Electronic("Smartphone", 699.99, "Iphone 12");
        Product electronic2 = new Electronic("TV", 199.99, "Samsung 55\"");
        Product food1 = new Food("Apple", 0.99, 52.0);
        Product food2 = new Food("Pizza", 12.99, 500.0);

        electronic1.printProduct();
        System.out.println("-------------");
        electronic2.printProduct();
        System.out.println("-------------");
        food1.printProduct();
        System.out.println("-------------");
        food2.printProduct();


    }
}
