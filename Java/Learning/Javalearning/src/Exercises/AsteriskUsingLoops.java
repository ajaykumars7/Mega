package Exercises;


class AsteriskUsingLoops{
    public static void asteriskRight(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    };

    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        int num = 0;
        while(num < 5){
            System.out.println("* ");
            int i = 0;
            while(i < num){
                System.out.println("* ");
                i++;
            }
            num++;
        }
        asteriskRight();

    }
}