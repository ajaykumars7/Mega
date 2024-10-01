package challenges;

public class MathFunction {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));
        System.out.println(Math.floor(99.99));
        System.out.println(Math.ceil(99.1));
        System.out.println("*********************************");
        for (int i = 0; i < 10; i++){
            int random = (int)Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
