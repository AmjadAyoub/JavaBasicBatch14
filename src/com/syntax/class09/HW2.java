package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		// 2. Create an array of animals and store 5 elements into it. Using 2 different
		// loops print all elements from the array.

		String animal[] = { "lion", "cat", "dog", "fish", "bird" };
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);
		}

		System.out.println("--------------------");

		for (String name : animal) {
			System.out.println(name + " ");

		}

	}
}
