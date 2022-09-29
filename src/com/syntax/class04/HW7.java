package com.syntax.class04;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals to 5 years 
		//than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		//otherwise bonus=3000.
		Scanner scan=new Scanner(System.in);
		System.out.println("For how many years have you been working at Amazon?");	
		int noOfYears=scan.nextInt();
		if(noOfYears>=5)
		{
			System.out.println("You are eligible for a bonus");
			System.out.println("How much is your annual salary?");
			int annualSalary=scan.nextInt();
			if(annualSalary>50000)
			{
				System.out.println("You are eligible for $5,000 bonus");
			} else
			{
				System.out.println("You are eligible for $3,000 bonus");
			}
						
		} else
		{
			System.out.println("Sorry, you are not eligible for a bonus");
		}
					
	}
		
	}


