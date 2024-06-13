package challenges;
import java.util.Scanner;

class LogicalOperator{
    public static void main(String[] args) {
//        check the number is positive, negative or zero
        System.out.println("Enter the Number.....");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0){
            System.out.println("the number is Positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        }else{
            System.out.println("the number is zero");
        }
    }
}