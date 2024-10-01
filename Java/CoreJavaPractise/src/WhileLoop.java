public class WhileLoop {
    public static void main(String[] args) {


//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("iteration ended");



//        int i = 1, sum = 0, till = 5;
//
//        while(i <= till){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);

//        int num = 3;
//        int fact = 0;
//        while(num >= 0){
//            fact += num;
//            num--;
//        }
//        System.out.println(fact);

        int num = 234;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }


    }
}
