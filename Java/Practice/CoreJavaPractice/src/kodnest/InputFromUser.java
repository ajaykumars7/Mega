package kodnest;
import java.util.Scanner;


class InputFromUser{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

//        STRING INPUT

//        String name = input.nextLine();
//        System.out.println("Name = " + name);


//        ADDING TWO NUMBERS
//        System.out.println("Enter the First Number");
//        int n1 = input.nextInt();
//        System.out.println("Enter the Second Number");
//        int n2 = input.nextInt();
//
//        int sum = n1 + n2;
//        System.out.println("sum = " + sum);


//        AVERAGE OF TWO NUMBERS
        System.out.println("Enter the First Number");
        int n1 = input.nextInt();
        System.out.println("Enter the Second Number");
        int n2 = input.nextInt();
        System.out.println("Enter the Third Number");
        int n3 = input.nextInt();

        double avg = (double) (n1 + n2 + n3)/3;
        System.out.println(avg);

    }}