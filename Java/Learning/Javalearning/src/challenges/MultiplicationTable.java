package challenges;
import java.util.Scanner;


class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = input.nextInt();
        multiplication(number);
    }
    public static void multiplication(int number){
        int i = 1;
        while(i <= 10){
            int result = i * number;
            System.out.println(number + "*" + i + "= " + result);
            i++;
        }
    }
}