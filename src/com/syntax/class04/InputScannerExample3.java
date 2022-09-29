package com.syntax.class04;

import java.util.Scanner;

public class InputScannerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		//we use nextInt() if we want to use int type of data from the keyboard.
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		
		
		if(age<18)
		{
			System.out.println("You should study");
		} else {
			System.out.println("you should start working");
		}
		
			

	}

}
