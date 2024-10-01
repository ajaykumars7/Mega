package javaRevise.oopsPractice1;





abstract class Vehicle{
   public abstract void start();
}

class Car extends Vehicle{

    @Override
    public void start(){
        System.out.println("Started");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Started");
    }
}
public class Java_8_AbstractVehicle {
    public static void main(String[] args) {
        System.out.println();
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();
    }
}
