package com.syntax.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit into celsius and 
		//print “The temperature is the city  is ” 
		Scanner scan=new Scanner(System.in);
		System.out.println("Which city do you live in?");
		String city=scan.next();
		System.out.println("What is the temperature in " + city+ "?");
		int temperature=scan.nextInt();
		int celsiusDegree=((temperature-32)*5/9);
		
		System.out.println("The temperature in "+city+" is "+celsiusDegree+" degrees in celsius");
		
		
	}

}
