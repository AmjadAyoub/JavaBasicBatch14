package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan is needed. If loan is less or equal to 200,000 then 
		//you would lend the money otherwise you would reject the client.
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the amount of loan that you need?");
		int loanAmount=loan.nextInt();
		if(loanAmount<=200000)
		{
			System.out.println("We can lend you the required loan");
		} else
		{ System.out.println("Sorry, but we cannot lend you this amount of money");
		}
		}
						
	}


