package com.syntax.class08;

import java.util.Scanner;

public class PlayAround {

	public static void main(String[] args) {
		// ask 2: Write a program to ask a user to enter item they want to buy and the price of that item. Every time user enters money, 
				//accumulate the amount and tell the user how much is left to pay off. If user give more money program should return a change. 
				//Whenever user done with payments program should say "Thank you for shopping!"
		Scanner scan=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item=scan.nextLine();
		System.out.println("How much is the "+item);
		double price=scan.nextDouble();
		double money;
		double totalPaid = 0;
		do {
			System.out.println("Please pay for the "+item);
			
			money=scan.nextDouble();
			totalPaid+=money;
			double leftToPay=price-totalPaid;
			double change=totalPaid-price;
			
			if(totalPaid<price) {
				System.out.println("You need to pay more "+ leftToPay);
			} else if(totalPaid>price)
				
			{
				System.out.println("Here is your change "+change);
				break;
			}	
			} while(totalPaid!=price);
			System.out.println("congrats");
		

	}

}
