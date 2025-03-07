package week4.Odev03.AbstractDemo01;

public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    double area(){
        return width * height;
    }

}
