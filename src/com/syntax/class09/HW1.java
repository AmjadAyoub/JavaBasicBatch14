package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		// 1. Create an array of cars and store 6 elements into it. Using 2 different
		// loops print all values from the array.

		String names[] = { "BMW", "Audi", "Nissan", "Toyota", "Tesla", "Kia" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("--------------");

		for (String num : names) {

			System.out.println(num + " ");
		}

	}

}
