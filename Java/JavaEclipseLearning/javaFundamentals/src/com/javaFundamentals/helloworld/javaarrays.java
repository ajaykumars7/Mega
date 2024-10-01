package com.javaFundamentals.helloworld;


public class javaarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Array practice");
//		String firstarray[] = {"Ajay", "Kumar", "s"};
//		for(int i=0; i<firstarray.length; i++)
//		System.out.println(i + " array element is " + firstarray[i]);
		int[] secondarray = new int[10];
		secondarray[0] = 34;
		secondarray[7] = 232;
		for(int i=0; i<secondarray.length; i++) {
			System.out.println(secondarray[i]);
			if(secondarray[i]==232) {
				System.out.println(secondarray[i] + " you got the one you searching for, it is in the address of " + i);
			}
		}
	}

}