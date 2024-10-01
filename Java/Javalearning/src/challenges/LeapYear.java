package challenges;
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();

        if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
            System.out.println("this year is leap year");
        }else{
            System.out.println("this year is not a Leap year");
        }
    }
}