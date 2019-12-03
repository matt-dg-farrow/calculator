package main.java.com.qa.app;

public class Addition implements Operations {

	@Override
	public String calculate(int number1, int number2) {

		int answer;

		answer = number1 + number2;

		return number1 + " + " + number2 + " = " + answer;

	}

}