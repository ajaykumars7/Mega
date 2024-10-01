package com.abstractpractice;

public class Square extends Shape {
    private double Sidesize;

    public Square(double sidesize) {
        Sidesize = sidesize;
    }

    public double getSidesize() {
        return Sidesize;
    }

    public void setSidesize(double sidesize) {
        Sidesize = sidesize;
    }

    @Override
    public double calculateArea() {
        return Math.pow(Sidesize, 2);
    }
}
