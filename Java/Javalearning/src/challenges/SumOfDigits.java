package challenges;
import java.util.Scanner;


class SumOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = input.nextInt();
        System.out.println(sumOfDigits(number));
    }
    public static int sumOfDigits(int number){
        int i = 0;
        int result = 0;
        while(i <= number){
            result += number % 10;
            number /= 10;
            i++;
        }
        return result;
    }
}