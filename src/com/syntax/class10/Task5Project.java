package com.syntax.class10;

public class Task5Project {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		int[][] number = { { 5, 9, 8 }, { 15, 24, 12 }, { 3, 4, 11 } };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if (number[i][j] % 2 == 0) {
					evenSum += number[i][j];
				} else {
					oddSum += number[i][j];
				}
			}
		}
		System.out.println("Total of odd numbers is " + oddSum);
		System.out.println("Total of even numbers is " + evenSum);
		
		System.out.println();
		System.out.println("Different way");
		int evenSum1 = 0;
		int oddSum1 = 0;
		
		for (int[] ar : number) {

            for (int num : ar) {
                if (num % 2 == 0) {
                    evenSum1 += num;
                } else {
                    oddSum1 += num;
                }

            }

        }
        System.out.println("Odd Sum " + oddSum1);
        System.out.println("Even Sum " + evenSum1);
		
	}

}
