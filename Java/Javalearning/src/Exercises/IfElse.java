package Exercises;
import java.util.Scanner;

class IfElse{
    public static void main(String[] args) {
        System.out.println("enter your age : ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18){
            System.out.println("your Child");
        }else{
            if(age == 18){
                System.out.println("your adult");
            }else{
                System.out.println("your elder than adult");
            }
        }
    }
}