package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		String str="I love java programming";
		
		// charAt returns us the character at a specific index
		
		System.out.println(str.charAt(2));
		
		
		// to print all the letters we have to use for loop
		for(int i=0; i<str.length(); i++) {
			
			//to print characters without spaces
			if(!(str.charAt(i)==' ')) {
			System.out.print(str.charAt(i));
		}

	}

}
}
