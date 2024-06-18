package challenges;
import java.util.Scanner;


class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = input.nextInt();
        int result = factorial(number);
        System.out.println("factorial of a given number is = " + result);
    }
    public static int factorial(int number){
        int fact = 1;
        int i = 1;
        if (number < i){
            System.out.println("1");
        }else{
            while (i <= number){
                fact *= i;
                i++;
            }System.out.println(fact);
        }return 0;
    }
}