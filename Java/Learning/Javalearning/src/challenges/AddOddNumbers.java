package challenges;
import java.util.Scanner;


class AddOddNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a big number : ");
        int number = input.nextInt();
        addOdd(number);

    }
    public static void addOdd(int number){
            int i = 1;
            int result = 0;
            while(i <= number) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    result += i;
                }
                i++;
            }
        System.out.println(result);

    }
}