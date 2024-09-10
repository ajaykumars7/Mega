package kodnest;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        //ELSE-IF BLOCK
        System.out.println("Enter your marks");
        int marks = input.nextInt();
        if(marks >= 91){
            System.out.println("get a Bike");
        } else if (marks >= 81) {
            System.out.println("get a laptop");
        } else if (marks >= 71) {
            System.out.println("get a mobile");
        } else if (marks >= 41) {
            System.out.println("get a cycle");
        }else{
            System.out.println("Get Out.....");
        }


//        TAKE 2 NUMBER AND GET WHICH ONE IS GREATER
//        System.out.println("Enter first number = ");
//        int num1 = input.nextInt();
//        System.out.println("Enter Second number = ");
//        int num2 = input.nextInt();
//
//        if(num1 > num2){
//            System.out.println("First Number is greater than Second Number");
//        }else{
//            System.out.println("Second Number is greater than first Number");
//        }

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
