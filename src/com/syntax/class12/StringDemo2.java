package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName); // mostly this is used
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(" ").concat(lastName));
		
		//isEmpty() returns true if a string is empty this method will return false even if
		// you have a space in a String variable however the isBlank Method does not count
		//the spaces
		
		String str="";
		System.out.println(str.isEmpty());
		
		
		String str1=" ";
		System.out.println(str1.isEmpty());
		//System.out.println(str.isBlank());
		
		// isBlank does not work on java 1.8

	}

}
