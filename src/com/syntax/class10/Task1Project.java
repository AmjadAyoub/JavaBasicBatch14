package com.syntax.class10;

import java.util.Scanner;

public class Task1Project {

	public static void main(String[] args) {
//Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array

		System.out.println("Please enter the size of an array");
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int sum = 0;
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter an element");
			array[i] = scan.nextInt();
			sum+=array[i];
			

		}
		System.out.println("The sum of elements is " + sum);

	}
}
