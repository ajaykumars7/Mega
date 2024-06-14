package challenges;
import java.util.Scanner;


class BitwiseOperatorChallenge{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int bitwiseAnd = num1 & num2;
        System.out.println(bitwiseAnd);
        int bitwiseOr = num1 | num2;
        System.out.println(bitwiseOr);
        int bitwiseXor = num1 ^ num2;
        System.out.println(bitwiseXor);
        int bitwiseNot = ~num2;
        System.out.println(bitwiseNot);
    }
}