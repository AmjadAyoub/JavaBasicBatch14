package com.syntax.class07;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// 6. Declare a variable to store a price for a coffee. Ask the user to pay for
		// a coffee. Keep asking to pay for coffee until the user enters the EXACT
		// amount .
		// If the user gives more than coffee price --> ask them to give less, if the
		// user gives less money then ask to give more.
		// Once user give EXACT amount print “Please enjoy your coffee
		Scanner scan = new Scanner(System.in);
		double price;
		price = 3.50;
		System.out.println("Please pay for the coffee");
		double pay = scan.nextDouble();

		while (pay != price) {
			if (pay > price) {

				System.out.println("Please pay less money");
				pay = scan.nextDouble();

			} else if (pay < price) {
				System.out.println("Please pay more money");
				pay = scan.nextDouble();
			}

		}
		System.out.println("Please enjoy your coffee");

	}

}
