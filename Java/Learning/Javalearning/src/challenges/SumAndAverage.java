package challenges;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] marks = {23, 34, 43, 54, 89};
        int i = 0, sum = 0, average = 0;
        while(i < marks.length){
            System.out.println(i);
            System.out.println(marks[i]);
            sum += marks[i];
            System.out.println(sum);
            average = sum / marks.length;
            i++;
        }
        System.out.println(marks.length);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(23 + 34 + 43 + 54 + 89);
        System.out.println((23 + 34 + 43 + 54 + 89)/5);
    }
}
