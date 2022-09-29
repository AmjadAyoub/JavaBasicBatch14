package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Batch 14 is good";
		
		//replace method replaces one string with another in a string
		// replaceAll : it takes a pattern and replace all the characters that follow that pattern
		System.out.println(str.replace("good","Excellent"));
		
		// prints all lower case letters to space or #
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[a-z]","#"));

	}

}
