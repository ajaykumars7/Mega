package kodnest;

import java.util.Scanner;

class Car {
    String colour;
    String brand;
    int cost;

    void speed(){
        System.out.println("FAST");
    }
    void accelerator() {
        System.out.println("Selected Accelerator");
    }
}

class Main{
    public static void main(String[] args) {
        Car c1 = new Car();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the colour, brand and cost of the car");
        c1.colour = input.next();
        c1.brand = input.next();
        c1.cost = input.nextInt();


        System.out.println("colour of the car is : " + c1.colour + "\nbrand is " +
                c1.brand + "\nand the price is "+ c1.cost + " only");
        c1.speed();
        c1.accelerator();
    }
}