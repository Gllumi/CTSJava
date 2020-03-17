package com.examples;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(PerformanceTest.class)
public class FunTest {
	
	@Test
	public void test() {
		System.out.println("funtest method output");
	}
	
	@Test
	public void test2() {
		System.out.println("funtest method 2 output");
	}
	
}
