package week4.Odev03.AbstractDemo01;

abstract class Shape {
    abstract double area();
    void printArea(){
        System.out.println("Area: " + area());
    }

}
