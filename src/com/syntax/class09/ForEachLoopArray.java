package com.syntax.class09;

public class ForEachLoopArray {

	public static void main(String[] args) {
		String [] iceCream = {"vanilla","chocolate","pistashio","kulfi","mango"};
		for(String flavor:iceCream) {
			System.out.println(flavor);
			
		}
		
		System.out.println("-------------");
		//using enhanced loop
		
		char[] letters= {'A', 'B', 'C', 'D', 'E'};
		for(char letter:letters) {
			System.out.print(letter+ " ");
		}
		System.out.println("---------------");
		
		int[] numbers= {12, 56, 345,1,0,9};
		//get all elements using regular for loop
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
		
		System.out.println();
		// get all values using enhanced for loop
		
		for(int num:numbers) {
			System.out.print(num+ " ");
		}

	}

}
