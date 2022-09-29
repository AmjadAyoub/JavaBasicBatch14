package com.syntax.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your home country?");
		String country = scan.nextLine();
		String language;
		switch (country) {
		case "USA":
		case "UK":
		case "Canada":
			language = "English";
			break;
		case "Lebanon":
		case "Syria":
			language = "Arabic";
			break;
		case "France":
			language = "French";
			break;
		case "Russia":
		case "Uzbekistan":
			language = "Russian";
			break;
		default:
			language = "Unknown";
			break;
		}
		System.out.println("You are from " + country + " and your language is " + language);

	}

}
