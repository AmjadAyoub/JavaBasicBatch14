package com.syntax.class09;

public class HW5 {

	public static void main(String[] args) {
		// 5. Create an array to store char values and then print those in reverse order
		
		// we cannot use enhanced for loop because it is reverse. Enhanced go in one direction only

		char letter[] = { 'A', 'B', 'C', 'D', 'E' };
		for (int i = letter.length - 1; i >= 0; i--) {
			System.out.println(letter[i]);
		}

	}

}
