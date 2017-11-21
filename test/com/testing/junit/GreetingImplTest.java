package com.testing.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.junit.GreetingImpl;

public class GreetingImplTest {
	
	
	private GreetingImpl greeting;

	@Before
	public void setup() {
		System.out.println("setup");
		 greeting = new GreetingImpl();
	}
	
	@Test
	public void test() {
		System.out.println("from test 1");
     String result = greeting.greet("Junit");
     assertNotNull(result);
     assertEquals("HelloJunit", result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGreetingImpl_Illegal_argument_Exception() {
		System.out.println("from test 2");
		greeting.greet(null);
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown");
		greeting =null;
	}
	
	
}
