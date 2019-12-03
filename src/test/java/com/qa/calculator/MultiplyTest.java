package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplyTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		String result = "The result is 4";
		Assert.assertEquals(result, calc.multiply(2, 2));
	}

}
