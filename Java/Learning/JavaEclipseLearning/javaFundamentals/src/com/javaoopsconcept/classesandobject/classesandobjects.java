package com.javaoopsconcept.classesandobject;

public class classesandobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstClass myBall = new firstClass();
		myBall.colour = "Red";
		myBall.name = "Cricket ball";
		myBall.bouncerate = 3;
		myBall.bouncing();
		System.out.println(myBall.colour);
		
	
		firstClass myBall2 = new firstClass();
		String B2C = myBall2.colour;
		B2C = "white";
		String B2N = myBall2.name;
 		B2N = "Tennis ball";
		System.out.println("name is " + B2N + " Colour is " + B2C);
		myBall2.defalte();
		
		System.out.println(accessmodifier.b());
		
	}

}.