package Exercises;

public class OopsFirst {
    public static class car{
        int noOfWheels;
        String title;

        void engineStart(){
            System.out.println("Engine Started");
        }
        void engineStop(){
            System.out.println("Engine Stopped");
        }

    }

    public static void main(String[] args) {
        car myCar = new car();
        myCar.noOfWheels = 4;
        myCar.title = "Audi";
        myCar.engineStart();
        myCar.engineStop();
        System.out.println("your car as " + myCar.noOfWheels + "Wheels");
    }

}
