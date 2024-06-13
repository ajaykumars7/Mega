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

//        check the number is odd or even
        System.out.print("enter the number : ");
        int number1 = input.nextInt();
        if (number1 % 2 == 0 ){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
//        check the number is greatest of three numbers
        System.out.println("enter the three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 < num2 & num3 < num2){
            System.out.println("num2 is greater" + num2);
        } else if (num) {

        }
    }
}