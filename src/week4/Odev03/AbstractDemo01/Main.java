package week4.Odev03.AbstractDemo01;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(3,4);
        triangle.printArea();

        Shape rectangle = new Rectangle(5,4);
        rectangle.printArea();

    }
}
