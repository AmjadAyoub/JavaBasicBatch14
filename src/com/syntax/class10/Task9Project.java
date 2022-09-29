package com.syntax.class10;

public class Task9Project {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int[] number = { 4, 9, 20, 7, 200, 70, 3 };
		int max = number[0];
		int min = number[0];

		for (int i = 0; i <= number.length - 1; i++) {
			if (number[i] > max) {
				max = number[i];

			} else if (number[i] < min) {

				min = number[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
