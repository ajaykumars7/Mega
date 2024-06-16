package Exercises;
import java.util.Scanner;

class LoopsMultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the multiple Number : ");
        int num = input.nextInt();
        System.out.println("Enter The End Number");
        int endNumber = input.nextInt();
        System.out.println("Enter The Start Number");
        int startNumber = input.nextInt();
        while (startNumber <= endNumber ){
            int result = num * startNumber;
            System.out.println(num + "*" + startNumber + "=" + result);
            startNumber++;
        }
    }
}