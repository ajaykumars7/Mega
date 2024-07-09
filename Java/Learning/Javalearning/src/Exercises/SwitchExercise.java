package Exercises;
import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    static void newSwitch(int day){
        String daystr = switch (day){
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            default -> "invalid";
        };
        System.out.println(daystr);
    }
    static void oldSwitch(int day){
        switch (day){
            case 1 : System.out.println("monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            default: System.out.println("invalid");
        }
    }
}
