package com.syntax.class05;

import java.util.Scanner;

// ctrl+shirt+o  to create java.util.scanner

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.next(); // Capturing String
		System.out.println("Nice to meet you " + name);
		System.out.println("How old are you " + name);

		int age = input.nextInt(); // Capturing int
		System.out.println(name + " is " + age + " years old");

		System.out.println("How much money do you have " + name);
		double money = input.nextDouble();

		System.out.println(name + " has $" + money);
		
		System.out.println(name+" what is your grade");
		char grade=input.next().charAt(0);
		System.out.println(name+" has grade "+grade);
		
		System.out.println("End"); 
		
		
		
	}

}
