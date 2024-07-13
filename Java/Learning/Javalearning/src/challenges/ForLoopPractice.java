package challenges;

public class ForLoopPractice {
    public static void main(String[] args) {
        int num = JavaUtility.simpleNumber();
        for(int i = 1; i <= 100; i++){
            System.out.print(i);
        }
        System.out.println(" ");
        for(int j = 1; j <= 10; j++){
            System.out.println(num + " * " + j + " = " + num*j);
        }
    }
}
