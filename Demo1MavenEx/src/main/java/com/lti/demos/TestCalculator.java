package com.lti.demos;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		int r=c.addNos(100, 200);
		System.out.println("Addition is :" +r);
	
	    int x=c.subNos(200,100);
	    System.out.println("Subtraction is :" + x);
	}

}
