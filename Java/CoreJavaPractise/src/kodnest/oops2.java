package kodnest;

import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    String branch;
    float cgpa;
    int yop;



    public Student(){

    }
    public Student(int rollNo, String name, String branch, float cgpa, int yop) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.yop = yop;
    }

    void prepare(){
        System.out.println("Student is preparing for the interview");
    }
    void giveIntro(){
        System.out.println("Roll NO : " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("CGPA : " + this.cgpa);
        System.out.println("YOP : " + this.yop);
    }
    void giveInterview(){
        System.out.println("Interview giving");
    }
}


public class oops2 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.rollNo = 21;
        std1.branch = "RoyalMech";
        std1.cgpa = 8.15f;
        std1.yop = 2022;
        std1.name = "Ajay Kumar s";

        Student std2 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ROLL NO, Branch, CGPA, Yop, Name");
        std2.branch = input.nextLine();
        std2.cgpa = input.nextFloat();
        std2.yop = input.nextInt();
        std2.name = input.nextLine();
        std2.rollNo = input.nextInt();


        std1.prepare();
        std1.giveInterview();
        std1.giveIntro();
    }
}
