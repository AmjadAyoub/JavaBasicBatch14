package com.syntax.class04;

import java.util.Scanner;

public class InputFrontKeyBoardExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner is a class that helps us take the input from the keyboard
		 * it contains many different smaller modules called methods that can help
		 * us take Strings booleans basically all types of data from the keyboard.
		 */
		
		Scanner input= new Scanner(System.in);
		// A message will display to the user on the console to enter his name
		System.out.println("Please enter your name");
		// Activates the Java program to take the input from the keyboard and store it inside the name variable.
		String name=input.next();   // the variable name (input) should be used in this line before .next
		// Prints whatever name user enters on the keyboard on the console
		System.out.println("Hello "+name+" do not be confused");
		
		

	}

}
