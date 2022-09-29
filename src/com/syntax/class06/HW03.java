package com.syntax.class06;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// Using scanner class create calculator. Allow user to enter 2 numbers and
		// operator(+,-,*,/). Based on operator provide the result to user.
		// Please complete this assignment in 2 ways: using if statement and switch
		// case.
		Scanner scan = new Scanner(System.in);
		System.out.println("IF STATEMENT CASE");
		System.out.println("Please enter two numbers");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		System.out.println("Please enter an Arithmetic operator for calculation");
		char operator = scan.next().charAt(0);
		if (operator == '+') {
			System.out.println("The calculation result is " + (number1 + number2));
		} else if (operator == '-') {
			System.out.println("The calculation result is " + (number1 - number2));
		} else if (operator == '*') {
			System.out.println("The calculation result is " + (number1 * number2));
		} else if (operator == '/') {
			System.out.println("The calculation result is " + (number1 / number2));
		} else {
			System.out.println("Please enter a valid operator");
		}  

		System.out.println("-----------------------------------------------");
		System.out.println("SWITCH CASE");
		double result=0.0;
		switch (operator) {
		case ('+'):
			result = number1 + number2;
			break;
		case ('-'):
			result = number1 - number2;
			break;
		case ('*'):
			result = number1 * number2;
			break;
		case ('/'):
			result = number1 / number2;
			break;
		default:
			System.out.println("please enter a valid operator");
			break;

		} System.out.println("The calculation result is "+result);

	}

}
