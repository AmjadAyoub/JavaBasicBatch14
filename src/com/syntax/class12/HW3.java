package com.syntax.class12;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// Write a program that reads two people's first names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby:
		  //   Example Output:
			// Mom’s first name? Mary
			// Dad’s first name? Daniel
			// Boy or Girl? boy
			// Suggested baby name: DANRY
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the father's name");	
		String dadName=scan.next();
		System.out.println("Please enter the mother's name");	
		String momName=scan.next();
		
		
		String boy = null;
		String girl=null;
		
		System.out.println("Are you expecting a boy or a girl?");
		String gender=scan.next();
		
		if(gender.equalsIgnoreCase("boy")) {
			
	System.out.println("Suggested boy's name is "+ dadName.substring(0,dadName.length()/2).toUpperCase()+momName.substring(momName.length()/2,momName.length()).toUpperCase());
			
		} else {
	System.out.println("Suggested girl's name is "+ momName.substring(0,momName.length()/2).toUpperCase()+dadName.substring(dadName.length()/2,dadName.length()).toUpperCase());		
		}
		
	}

}
