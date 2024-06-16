package challenges;
import java.util.Scanner;

class NumberEvenOrOddUsingBitwise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        if ((num & 1) == 1){
            System.out.println("Your number is Odd");
        }else {
            System.out.println("Your Number is Even");
        }
    }
}