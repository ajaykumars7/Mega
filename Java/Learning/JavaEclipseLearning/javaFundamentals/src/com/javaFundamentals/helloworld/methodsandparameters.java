package com.javaFundamentals.helloworld;

public class methodsandparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int sum = Add(4, 5);
		String fullname = fullname("Ajay", "Kumar");
		boolean age = isTrue(true);
		System.out.println(sum);
		System.out.println(fullname);
		System.out.println(age);
		
		
		
		
		
		/*
		Addition(7, 4);
		Addition(7, 11);
		basicmethod();
		exeahh("Ajay", "kumar", 's'); */
	}
	
	
	public static int Add(int a, int b) {
		return a + b;
	}
	public static String fullname(String fname , String lname) {
		return fname + lname;
	}
	public static boolean isTrue(boolean age) {	
		if(age == true) {
		    System.out.println("your eligible to vote");
		}else {
			System.out.println("your not eligible to vote");
		}
		return age;
	}
	
	
	

	/*
	public static void Addition(int a, int b) {
		System.out.println("sum of two number is " + (a + b));
	}
	public static void exeahh(String fname, String lname, char intial) {
		System.out.println(fname + " " + lname + " " + intial);
	}
	public static void basicmethod() {
		System.out.println("its a basic method usage without parameters");
	}
	*/
}
