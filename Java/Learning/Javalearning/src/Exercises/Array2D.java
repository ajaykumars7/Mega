package Exercises;

public class Array2D {
    public static void main(String[] args) {
        int[][] number = {{23,32}, {43,54}};
        int i = 0;
        while(i < number.length){
            int j = 0;
            while (j < number.length){
                System.out.print(number[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
