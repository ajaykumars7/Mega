import java.util.Scanner;

class inputsFromUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        String Name = input.nextLine();

        System.out.println("Please enter your age : ");
        int Age = input.nextInt();

        System.out.println("hi... " + Name);
        System.out.println("your Age is " + Age);

    }
}

