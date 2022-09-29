package com.syntax.class06;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other
		// grade --> Not Acceptable. At the end your program should print which grade
		// was entered by a user with explanation.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Grade");
		char grade = scan.next().charAt(0);
		String score;
		switch (grade) {
		case 'A':
			score = "Excellent";
			break;
		case 'B':
			score = "Good";
			break;
		case 'C':
			score = "Average";
			break;
		case 'D':
			score = "bad";
			break;
		default:
			score = "Not Acceptable";
			break;

		}
		System.out.println("Your grade is " + grade + " and your score is " + score);

	}

}
