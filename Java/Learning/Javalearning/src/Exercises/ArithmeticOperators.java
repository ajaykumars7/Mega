package Exercises;
import java.util.Scanner;


class ArithmeticOperators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
//        Arithmetic Operators

//        Addition
        int Sum = num1 + num2;
//        Subtraction
        int sub = num1 - num2;
//        Multiplication
        int mul = num1 * num2;
//        Division
        int div = num1 / num2;
//        Modulus
        int mod = num1 % num2;
        System.out.println("Sum is = " + Sum);
        System.out.println("Sub is = " + sub);
        System.out.println("mul is = " + mul);
        System.out.println("div is = " + div);
        System.out.println("mod is = " + mod);



//    Shorthand
        int a = 5;
        int b = 10;
        System.out.println(a);
        a += 10;
        System.out.println(b);
        b = b +5;
        System.out.println(a);
        System.out.println(b);


//        unary
        int d = 5;
        System.out.println(d);
        d = --d;
        System.out.println(d);
        d = ++d;
        System.out.println(d);
        d = d++;
        System.out.println(d);
        d = d--;
        System.out.println(d);
        System.out.println(d);





    }
}