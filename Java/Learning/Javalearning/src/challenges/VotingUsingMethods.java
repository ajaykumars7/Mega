package challenges;
import java.util.Scanner;

class VotingUsingMethods{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = input.nextInt();

        eligibleForVoting(age);
    }
    public static void eligibleForVoting(int age){
        if(age >= 18){
            System.out.println("your eligible for voting");
        }else{
            System.out.println("Your not eligible for voting");
        }
    }
}

