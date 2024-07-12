package challenges;
import java.util.Scanner;
public class MarksRanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int marks = input.nextInt();
        String result = marks >= 80 ? "high" :  (marks >= 50 ? "medium" : "low");
        System.out.println(result);

    }
}
