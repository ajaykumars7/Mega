package challenges;
import java.util.Scanner;


class ProductOfTwoFloatingNumb{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        float num1 = input.nextFloat();
        System.out.println("enter 2st number : ");
        float num2 = input.nextFloat();

        float mul = num1 * num2;
        System.out.println("the product of two number is = " + mul);
    }
}