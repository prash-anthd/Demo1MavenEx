package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCalc{
	
	Calculator c = new Calculator();
	@Disabled 
	@Test
	public  void testHello()
	{
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	@Disabled 
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(300,c.addNos(100,200),"code working");
	}
	@Disabled 
	@Test
	public void testSubtract()
	{
		Assertions.assertEquals(100,c.subNos(200,100));

	}
	@Disabled 
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("Prashanth".length()==10);
		Assertions.assertFalse(10>20,"assertion message");
		
	}
	
	@Test
	void testAssertNull()
	{
		String str1 = null;
		String str2 = "abc";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	@Test
	public void testEmptyArrayList()
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Assertions.assertEquals(0, a1.size());
		Assertions.assertTrue(a1.isEmpty());
		a1.add(100);
		a1.add(200);
		
	}
}
