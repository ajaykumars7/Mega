package javaRevise.oopsPractice1;

import java.util.Scanner;

public class Java_4_1_Arrays {
    public static void main(String[] args) {


//        int[] Temperature =  {23, 34, 32,18,28,23,34,21, 32,23,34,34};

           int[][] Mat1 = {{1,2,3}, {2,2,2},{1,2,3}};
           int[][] Mat2 = {{1,2,3}, {3,3,3},{1,2,3}};
           int[][] Mat3 = new int[3][3];

        for(int i = 0; i < Mat1.length; i++){
            for (int j =0; j < Mat1.length; j++){
                Mat3[i][j] = Mat1[i][j] + Mat2[i][j];
            }
        }
        System.out.println();

        System.out.println("SUM of two matrix");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Mat3[i][j]);
            }
        }




        //------------------------------------------------------------

//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//
//        boolean found = false;
//        int count = 0;
//        for(int i = 0; i < (Temperature.length - 1); i++)
//        {
//            if(number == Temperature[i]){
//                System.out.println(number + " is found in index " + i);
//                found = true;
//                count++;
//            }
//        }
//        if(!found){
//            System.out.println("the number is not found");
//        }
//        System.out.println("count = " + count);

        //-------------------------------------------------------------
//        System.out.print("Original Array = ");
//        for(int i = 0; i <= (Temperature.length - 1); i++){
//            System.out.print(Temperature[i] + " ");
//        }
//        System.out.println();
//        System.out.print("Reverse Array = ");
//        for(int i = (Temperature.length - 1); i >= 0 ; i--){
//            System.out.print(Temperature[i] + " ");
//        }
        //--------------------------------------------------------------



//        int sum = 0;
//        System.out.println(Temperature.length);
//        for(int i = 0; i< Temperature.length; i++){
//            System.out.print(Temperature[i] + " ");
//            sum += Temperature[i];
//        }
//        System.out.println();
//        System.out.println("sum = " + sum);
//        System.out.println(sum/ Temperature.length);
//        System.out.println(185/8);

        //Max Temperature
//        int max = Temperature[0];
//        for(int i = 1; i < Temperature.length; i++){
//            if(max < Temperature[i]){
//                max = Temperature[i];
//            }

//        }System.out.println(max);
    }
}
