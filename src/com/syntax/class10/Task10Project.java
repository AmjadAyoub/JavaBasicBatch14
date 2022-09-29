package com.syntax.class10;

public class Task10Project {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int [] number= {100,50,900,450,30,1000};
		int largest=number[0];
		int secondLargest=number[0];
		
		for(int i=0; i<=number.length-1; i++) {
			if (number[i] > largest) {
				secondLargest=largest;
				largest = number[i];
		}
	
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);
	}

	}


