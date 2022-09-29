package com.syntax.class07;

import java.util.Scanner;

public class HW6AselWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double price=2.85;
		double pay=0.0;
		do {
			System.out.println("Please pay for the coffee");
			pay=scan.nextDouble();
			if(pay>price) {
				System.out.println("please pay less");
			} else if(pay<price) {
				System.out.println("Please pay more ");
			}
		}
		while (pay!=price);
		System.out.println("Please enjoy your coffee");
			
			
			
		}

	}


