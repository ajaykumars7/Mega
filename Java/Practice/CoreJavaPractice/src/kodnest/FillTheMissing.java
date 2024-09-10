package kodnest;

public class FillTheMissing {
    public static void main(String[] args) {
        add();
        subtract(80,40);
        int prod = multiply(20, 5);
        double q = divide();
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + q);
    }

    public static void add(){
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
    public static void subtract(int num1, int num2){
        int diff = num1 - num2;
        System.out.println("Subtraction = " + diff);
    }
    public static int multiply(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }
    public static double divide(){
        int num1 = 10;
        int num2 = 4;
        double q= ((double)num1/num2);
        return q;
    }

}
