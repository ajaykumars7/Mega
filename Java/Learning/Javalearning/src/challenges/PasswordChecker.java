package challenges;

public class PasswordChecker {
    public static void main(String[] args) {
        int originalPassword = 123456;
        int enteredPassword = JavaUtility.simpleNumber();
        check(originalPassword, enteredPassword);
    }
    public static void check(int originalPassword, int enteredPassword){
        do{
            System.out.println("please enter your password");
        }while(originalPassword != enteredPassword);{
            enteredPassword = JavaUtility.simpleNumber();
        }
        System.out.println("successfully login ...");
    }
}
