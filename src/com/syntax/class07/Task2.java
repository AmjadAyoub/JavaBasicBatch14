package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		// Print numbers from 100 to 1
		// print even numbers from 20 to 100
		// print only odd numbers from 100 to 1 (2 different ways)
		
		int i=100;
		while(i>=1) {
			System.out.print(i+ " ");
			i--;
		}
		
		System.out.println("------------------------");
		
		int n=20;
		while(n<=100) {
			System.out.print(n+ " ");
			n+=2;
		}
		System.out.println("-------------------");
		
		int c=99;
		while(c>=1)
		{
			System.out.print(c+ " ");
			c-=2;
		}
		
		System.out.println(" Another Way");
		
	}

}

