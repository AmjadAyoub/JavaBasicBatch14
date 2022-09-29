package com.syntax.class04;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a driver licence to
		//them, otherwise you will offer them to get a learners permit.
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age>=18)
		{ System.out.println("We can issue you a driver's license");
		} else
		{ System.out.println("Sorry, we cannot issue you a driver's license but you can get a learner's permit");
		}
		}
		
	}


