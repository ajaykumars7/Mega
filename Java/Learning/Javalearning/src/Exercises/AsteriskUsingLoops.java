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

        int rows = 5;
        int i = 1;
        while (i <= rows){
            int j = 1;
            while (j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println("\n");
            i++;
        }
        asteriskRight();

    }
}