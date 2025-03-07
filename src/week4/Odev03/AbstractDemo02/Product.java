package week4.Odev03.AbstractDemo02;

abstract class Product {

    public String name;
    public double price;
    public double tax = 0;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateTax();

    public void printProduct(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + calculateTax());

    }

}
