package challenges;
import java.util.Scanner;
public class MonthUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = input.nextInt();
        String month = getMonthName(num);
        System.out.println(month);
//        String month = switch (num){
//            case  1 -> "jan";
//            case  2 -> "feb";
//            case  3 -> "mar";
//            case  4 -> "apr";
//            case  5 -> "may";
//            case  6 -> "jun";
//            case  7 -> "jul";
//            default -> "invalid";
//        };
//        System.out.println(month);
    }
public static String getMonthName(int num){
    String month = switch (num){
        case  1 -> "jan";
        case  2 -> "feb";
        case  3 -> "mar";
        case  4 -> "apr";
        case  5 -> "may";
        case  6 -> "jun";
        case  7 -> "jul";
        default -> "invalid";
    };
    return month;
}
}
