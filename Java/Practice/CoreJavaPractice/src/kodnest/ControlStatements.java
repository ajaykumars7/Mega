package kodnest;

import java.util.Scanner;

public class ControlStatements {

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void sub(int a, int b){
        int sub = a - b;
        System.out.println(sub);
    }
    public static void mul(int a, int b){
        int mul = a * b;
        System.out.println(mul);
    }
    public static void div(int a, int b){
        int div = a / b;
        System.out.println(div);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Select to perform a particular Operation");
        System.out.println("enter 1-add, 2-sub, 3-mul, 4-div");
        int operationNum = input.nextInt();



        System.out.println("Enter the First number");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number");
        int num2 = input.nextInt();

        if(operationNum == 1){
            add(num1, num2);
        } else if (operationNum == 2) {
            sub(num1, num2);
        }else if (operationNum == 3) {
            mul(num1, num2);
        }else if (operationNum == 4) {
            div(num1, num2);
        }else{
            System.out.println("WRONG INPUT.....TRY AGAIN");
        }







        //ELSE-IF BLOCK
//        System.out.println("Enter your marks");
//        int marks = input.nextInt();
//        if(marks >= 91){
//            System.out.println("get a Bike");
//        } else if (marks >= 81) {
//            System.out.println("get a laptop");
//        } else if (marks >= 71) {
//            System.out.println("get a mobile");
//        } else if (marks >= 41) {
//            System.out.println("get a cycle");
//        }else{
//            System.out.println("Get Out.....");
//        }


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
