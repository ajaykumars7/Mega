package challenges;
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("welcome to array sum and average");
        int[] numArray = JavaUtility.inputArray();
        int sum = sum(numArray);
        float average = average(numArray);
        System.out.println(sum);
        System.out.println(average);
    }

    public static int sum(int[] numArray){
        int sum = 0, i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static float average(int[] numArray){
        int sum = sum(numArray);
        return (float) (sum/ numArray.length);
    }

}
