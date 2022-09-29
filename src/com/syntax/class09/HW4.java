package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// 4. From an array of integer elements find the largest number.

		int num[] = { 9, 100, 25, 109, 20 };
		int largest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {

				largest = num[i];
			}
		}
		System.out.println("The largest number is " + largest);
		
		System.out.println("-------------------");
		
		largest=num[0];
		for(int n:num) {
			if(n>largest) {
			
			largest=n;
			}
		}
			System.out.println(largest);
	}

}
