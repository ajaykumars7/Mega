package challenges;
import java.util.Scanner;
class GradeCalculation{
    public static void main(String[] args) {
        System.out.println("Grade Calculation........! " + " \n Enter your Percentage");
        Scanner input = new Scanner(System.in);
        float Percentage = input.nextFloat();
        if(Percentage >= 90){
            System.out.println("Your grade is A");
        } else if (Percentage >= 75) {
            System.out.println("Your grade is B");
        }else if (Percentage >= 60) {
            System.out.println("Your grade is C");
        }else if (Percentage >= 35) {
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your Fail");
        }
    }
}