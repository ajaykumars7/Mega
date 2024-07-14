package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class CalculatorGeometry {
    public static void main(String[] args) {
        Circle cir = new Circle(23);
        Rectangle rect = new Rectangle(10, 5);

        double AreaOfCircle = (int)Math.PI * (Math.pow(cir.radius, 2));
        int AreaOfRectangle = rect.breadth * rect.length;
        System.out.printf("Area of the rectangle is %d , and Area of the circle is %f",AreaOfRectangle, AreaOfCircle);
    }
}
