package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplyTest {

	@Test
	public void test() {
		Multiplication multiply = new Multiplication();
		String result = "The result is 4";
		Assert.assertEquals(result, multiply.calculate(2, 2));
	}

}
