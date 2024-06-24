package challenges;

import java.util.Scanner;

public class JavaUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of elements in array : ");
        int size = input.nextByte();
        int[] numbers = new int[size];
        int i = 0;
        while(i < numbers.length){
            System.out.print("enter the " + (i + 1) + " number :");
            numbers[i] = input.nextInt();
            i++;
        }
        return numbers;
    }
}
