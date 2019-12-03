package com.qa.app;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void subtractionTest() {
		Subtraction operation = new Subtraction();
		int answer = operation.calculate(2, 1);
		Assert.assertEquals(1, answer);
	}

}
