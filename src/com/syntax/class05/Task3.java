package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Ask user to enter a number and then define if number is small, medium or large
		//Small number is value between 1 and 10
		//Medium number is value between 11 and 100
		//Large number is value between 101 and 1000
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		if(number>0 && number<11) {
			System.out.println("It is a small number");
		} else if(number>10 && number<101) {
			System.out.println("It is a medium number");
		} else 
			System.out.println("It is large number");
		}
		
			

	}


