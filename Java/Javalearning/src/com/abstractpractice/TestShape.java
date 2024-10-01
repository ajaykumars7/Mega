package com.abstractpractice;

public class TestShape {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square sqr = new Square(10.3);
        System.out.println(cir.calculateArea());
        System.out.println(sqr.calculateArea());
    }
}
