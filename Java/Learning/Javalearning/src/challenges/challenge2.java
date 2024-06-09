import java.util.Scanner;

class challenge2{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

//        Welcome "Name" to KG Coding
        System.out.println("Please Enter your Name : ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + " to KG coding");

//        Adding Two Numbers
        System.out.println("Enter the First Number : ");
        int Num1 = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int Num2 = input.nextInt();
        System.out.println("Sum of Two Number Is = " + (Num1 + Num2));
    }
}