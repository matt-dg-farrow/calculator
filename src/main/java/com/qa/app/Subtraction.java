package main.java.com.qa.app;

public class Subtraction implements Operations {

	@Override
	public String calculate(int number1, int number2) {
		int answer;

		answer = number1 - number2;

		return number1 + " - " + number2 + " = " + answer;

	}

}
