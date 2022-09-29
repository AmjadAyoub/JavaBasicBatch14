package com.syntax.class12;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
     Scanner scan=new Scanner (System.in);
     System.out.println("Please enter any word");
     String word=scan.next();
		    
     if(!word.isEmpty()) {
    	 if((word.length()%2!=0) && word.length()>=3) {
    		 System.out.println(word.charAt(word.length()/2));
    	 }
     }
		
		
		
	}

}
