package challenges;
import java.util.Scanner;


class Lcm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number = ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number = ");
        int num2 = input.nextInt();

        lcm(num1, num2);
    }
    public static int lcm(int a, int b){
        int i = 1;
        while(true){
            int factor = a * i;
            if(factor % b == 0 ){
                return factor;
            }
            i++;
        }
    }
}