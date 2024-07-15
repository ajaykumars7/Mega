package com.trycatch;

import challenges.JavaUtility;

public class TestTryCatch2 {
    public static void divide(int a, int b){
        try {
            System.out.println(a/b);
        }
//        catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index error");}
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            if(e instanceof ArithmeticException){
                System.out.println("divide by zero is invalid");
            }else{
                System.out.println("array size error please verify");
            }
        }
        finally {
            System.out.println("i am final block , i will execute what ever the situation is");
        }
    }
    public static void main(String[] args) {
        int num1 = JavaUtility.simpleNumber();
        int num2 = JavaUtility.simpleNumber();
        divide(num1,num2);
//        System.out.printf("first number %d, second number %d and sum of these 2 numbers is %d", num1,num2,divOfTwoNumbers);
        System.out.println("i am last in the execution");

    }
}
