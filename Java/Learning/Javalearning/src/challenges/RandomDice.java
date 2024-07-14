package challenges;

 class RandomDice {
     public int roll(){
         double result = Math.random() * 6;
         return (int)Math.ceil(result);
     }
    public static void main(String[] args) {
         RandomDice dice = new RandomDice();
        System.out.println(dice.roll());
         for (int i = 0; i < 10; i++){
//             System.out.println(dice.roll());
             int u1;
             do {
                 u1 = JavaUtility.simpleNumber();
             }while(u1 != dice.roll());
             System.out.println("**............you guessed it.........**");
        }

    }
}
