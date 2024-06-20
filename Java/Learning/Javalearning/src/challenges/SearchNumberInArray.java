package challenges;
import java.util.Scanner;
public class SearchNumberInArray {
    public static void main(String[] args) {
        int[] myArr = {21, 32, 43, 54, 65};
        System.out.println("Enter a number that you want to search ..... ");
        Scanner input = new Scanner(System.in);
        int Numb = input.nextInt();
//        isFound(myArr, Numb);
        boolean isFound = isFound(myArr, Numb);
        if(isFound){
            System.out.println("Number was found.......");
        }else{
            System.out.println("Number was not found.......");
        }


    }
    public static boolean isFound(int[] myArr, int Numb){
        int i = 0;
        while(myArr.length > i){
            if(Numb == myArr[i]){
                return true;
            }
            i++;
        }
        return false;
    }
}
