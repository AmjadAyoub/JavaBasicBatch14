package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		String str="I am always confused";
		
		// to print the index number of first a
		System.out.println(str.indexOf("a"));  // 2
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		// prints smaller piece that starts from the index number given
		System.out.println(str.substring(2));
		
		// starts at index 5 and ends at index 13-1=12
		System.out.println(str.substring(5,13));
		
		
	}

}
