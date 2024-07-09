package Exercises;
import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day){
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            default:
                System.out.println("invalid");

        }

    }
}
