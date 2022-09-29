package com.syntax.class10;

import java.util.Scanner;

public class Task8Project {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.print(num1 + " " + num2);
		
		for(int i=0; i<8; i++) {
			sum=num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
			
			
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("Different way using arrays");
		
		int[] fibonacci = new int[10];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];

		}
		for (int elements : fibonacci) {
			System.out.print(elements + " ");
			{

			}
		}
	}
}
		
		
		
		

	


