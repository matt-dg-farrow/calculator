package com.qa.app;

public abstract class Calculator {
	public int number1;
	public int number2;

	public interface Operation {

		public void addition();

		public void subtract();

		public void multiply();

		public void divide();

		public void exponent();
	}
}