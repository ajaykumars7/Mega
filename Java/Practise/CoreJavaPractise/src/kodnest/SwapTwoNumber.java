package kodnest;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number = ");
        int num1 = input.nextInt();
        System.out.print("enter second number = ");
        int num2 = input.nextInt();
        System.out.println("Before Swap");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
         num1 = (num1 + num2)/100;
         num2 = (num1 + num2)*100;



        System.out.println("After Swap");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

    }
}
