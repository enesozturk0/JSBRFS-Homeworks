package week4.Odev03.AbstractDemo01;

public class Triangle extends Shape{

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return height * base / 2 ;
    }

}
