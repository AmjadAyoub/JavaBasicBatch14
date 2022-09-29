package com.syntax.class05;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested if example
		boolean allergy = true;

		String allergyType = "Pollen";
		if (allergy) {

			System.out.println("Let us check what allergy you have");
			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoor when trees are");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Diary")) {
				System.out.println("Stay away from dairy products");
			}
		} else {
			System.out.println("You are lucky");
		}

	}

}
