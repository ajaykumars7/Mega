package kodnest.controlStatements;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





//        TAKE 2 NUMBER AND GET WHICH ONE IS GREATER
        System.out.println("Enter first number = ");
        int num1 = input.nextInt();
        System.out.println("Enter Second number = ");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("First Number is greater than Second Number");
        }else{
            System.out.println("Second Number is greater than first Number");
        }

//        IF ELSE
//        System.out.print("please enter the number : ");
//        int number = input.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("The number is  Even");
//        }else{
//            System.out.println("the number is odd");
//        }

//        SIMPLE IF
//        System.out.println("Welcome to kodnest");
//        System.out.println("Enter Your Rank");
//        int rank = input.nextInt();
//        if(rank == 1){
//            System.out.println("🎉 Your the fresher of the year");
    }
}
