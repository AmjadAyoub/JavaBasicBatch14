package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" i love java";
		System.out.println(str);
		
		// Remove the spaces before and after the String but not the ones 
		//which are present in between
		
		System.out.println(str.trim());
		
		String str2="Java is very easy";
		// startsWith=> checks if a String starts with a specific letter or word
		//endsWith=> checks if a String ends with a specific letter or word
		//contains=> checks if a string contains a specific letter or word
		System.out.println(str2.startsWith("Java"));  // true
		System.out.println(str2.startsWith("J"));  // true
		System.out.println(str2.startsWith("j"));  // false
		
		System.out.println(str2.endsWith("J"));  // false
		System.out.println(str2.endsWith("y"));  // true
		
		System.out.println(str2.contains("very"));  // true
		
		String str3="Java is Very easy";
		System.out.println(str3.contains("very"));  //false
		System.out.println(str3.toLowerCase().contains("very"));  // true
		System.out.println(str3.equalsIgnoreCase("Java is very easy"));
		
	}

}
