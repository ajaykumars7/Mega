package com.javaFundamentals.helloworld;

public class Ifstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 = -> Assignment operators
		 == -> Comparison operators
		 > -> greater than
		 < -> less than
		 >= -> greater than or equal too
		 <= ->less than or equal too
		 */
		
		int age = 15;
		
		if(age == 18) {
			System.out.println("Congratulations....!");
			System.out.println("Apply For voter card");
		}
//		else if(age>18);{
//			System.out.println("your ready to vote");
//		}
			else{
			System.out.println("your not eligible for vote");
		}
	}

}
