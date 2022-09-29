package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		// proper way to create an object
		String str=new String("Java");
		// simpler and shorter way provided by Java creators to make our life easier
		String name="gagagagagagagaggagagagaa";   // only works for String and Wrapper classes
		
		// counts the number of characters in a string including the spaces
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name cannot be more than 15 characters");
		}

	}

}
