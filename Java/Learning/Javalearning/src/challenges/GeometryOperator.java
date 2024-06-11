package challenges;
import java.util.Scanner;

class GeometryOperator {
    public static void main(String[] args) {

//        Perimeter
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st side : ");
        float s1 = input.nextFloat();
        System.out.println("enter 2st side : ");
        float s2 = input.nextFloat();
        System.out.println("enter 3st side : ");
        float s3 = input.nextFloat();
        System.out.println("enter 4st side : ");
        float s4 = input.nextFloat();

        float Perimeter = s1 + s2 + s3 + s4;
        System.out.println("perimeter of the Rectangle is  " + Perimeter);

//        Area Of Triangle
        System.out.println("enter breadth of the triangle ");
        float Breadth = input.nextFloat();
        System.out.println("enter Height of the triangle ");
        float Height = input.nextFloat();
        float Area = ((float) 1/2)*(Breadth * Height);
        System.out.println("Area of the Triangle is " + Area);


//        convert fahrenheit to celsius

        System.out.println("enter fahrenheit temperature : ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * ((float) 5 / 9);
        System.out.println("degree celsius is " + cel);



    }
}