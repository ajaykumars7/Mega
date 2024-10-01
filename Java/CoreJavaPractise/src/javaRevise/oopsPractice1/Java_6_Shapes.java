package javaRevise.oopsPractice1;

import javax.crypto.Cipher;

class Shape{
    public double area(){
        return 0;
    }
}

class Rectangle extends Shape{
    double length, breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}


class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

public class Java_6_Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(24, 23);
        Circle circle = new Circle(21);

        System.out.println("Area of a Rectangle is " + rectangle.area());
        System.out.println("Area of a Circle is " + circle.area());
    }
}
