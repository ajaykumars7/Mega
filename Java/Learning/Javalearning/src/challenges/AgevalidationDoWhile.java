package challenges;

public class AgevalidationDoWhile {
    public static void main(String[] args) {
//        int age = JavaUtility.simpleNumber();
//        while (age < 0 || age > 100){
//            age = JavaUtility.simpleNumber();
//        }
//        System.out.println("your age is " + age);
//    }
        int age;
        do{
            age = JavaUtility.simpleNumber();
        }while(age < 0 || age > 100);{
            age = JavaUtility.simpleNumber();
        }
        System.out.println("your age is " + age);
};
}
