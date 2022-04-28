package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	int sum;
	@BeforeAll
	public static void testdbconn()
	{
		System.out.println("db conn is up");
	}
	
	@BeforeEach
	public void testStartUp()
	{
		sum=0;
		System.out.println("sum init to zere");
	}
	
	
	
	@Test
	public void testAddition()
	{
		System.out.println("test add method");
		Calculator c = new Calculator();
		int result = c.addNos(100, 300);
		Assertions.assertEquals(400,result);
	}
	@Test
	public void testSubtraction()
	{
		System.out.println("test sub method");
		Calculator c = new Calculator();
		int result = c.subNos(100, 50);
		Assertions.assertEquals(50,result);
	}
	
	@AfterAll
	public static void testCloseConn()
	{
		System.out.println("db conn is closed");
	}
	
	@AfterEach
	public void testCloseUp()
	{
		sum=0;
		System.out.println("sum init to zero");
	}

}
