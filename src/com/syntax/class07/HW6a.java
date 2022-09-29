package com.syntax.class07;

import java.util.Scanner;

public class HW6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double price;
		price = 3.50;
		System.out.println("Please pay for the coffee");
		double pay = scan.nextDouble();

		if(pay!=price) {
			do {
				System.out.println("Please pay more money");
				pay = scan.nextDouble();

			} while (pay < price);

			do {
				System.out.println("Please pay less money");
				pay = scan.nextDouble();

			} while (pay > price);
		} 
			if(pay==price) {
			do {
				System.out.println("Please enjoy your coffee");
				pay = scan.nextDouble();

			} while (pay == price);
			
		
			}
		

		}

	}

