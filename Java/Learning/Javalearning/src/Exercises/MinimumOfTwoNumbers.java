package Exercises;
import java.util.Scanner;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st number : ");
        int Num1 = input.nextInt();
//        System.out.print("enter 2st number : ");
//        int Num2 = input.nextInt();
        int result = Num1 >= 0 ? Num1 : -Num1;
        System.out.println(result);
    }
//    public int min(int Num1, int Num2){
//        if(num1 < num2){
//            return num2;
//        }else{
//            return num1;
//        }
//        return Num1 < Num2 : Num1 ? Num2;
//    }
}
