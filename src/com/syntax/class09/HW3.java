package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// 3. Create an array on integers and calculate the sum of all elements in an
		// array

		int sum = 0;
		int sum1 = 0;

		int num[] = { 4, 9, 58, 96 };
		for (int integer : num) {
			sum += integer;
		}

		System.out.println("The sum is " + sum);
		System.out.println("---------------");

		for (int i = 0; i < num.length; i++) {
			sum1 += num[i];
		}
		System.out.println("The sum is " + sum1);

	}

}
