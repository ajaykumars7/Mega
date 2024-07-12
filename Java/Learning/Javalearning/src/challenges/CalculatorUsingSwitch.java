package challenges;
import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("enter the second number : ");
        int num2 = input.nextInt();
        System.out.println("enter a operator : ");
        String operator = input.next();
        int result = makeOperation(num1, num2, operator);
        System.out.println(result);
    }
    public static int makeOperation(int num1, int num2, String operator){
        int operation = switch (operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
        return operation;
    }
}
