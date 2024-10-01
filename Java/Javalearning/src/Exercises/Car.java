package Exercises;

public class Car {
    String company;
    String speed;
    int cost;
    int seats;

    public Car(String company, String speed, int cost, int seats) {
        this.company = company;
        this.speed = speed;
        this.cost = cost;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", speed='" + speed + '\'' +
                ", cost=" + cost +
                ", seats=" + seats +
                '}';
    }

    public static void main(String[] args) {
        Car Swift = new Car("maruthi", "1000km/h", 1000000,2);
        System.out.println(Swift.toString());
    }
}
