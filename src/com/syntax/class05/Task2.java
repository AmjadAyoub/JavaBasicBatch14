package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, 
		//anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of day");
		int today=scan.nextInt();
		if(today>0 && today<6) {
			System.out.println("It is a weekday");
		} else if (today ==6 || today==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
			
		}
		
				
			

	}

}
