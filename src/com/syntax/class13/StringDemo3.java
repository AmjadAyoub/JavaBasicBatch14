package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="shdhAGJRfghjddj19246254!@#$%*$";
  System.out.println(str.replaceAll("[0-9]", "@"));
  System.out.println(str.replaceAll("[0-9]", ""));// will replace all numbers from 0 to 9
  System.out.println(str.replaceAll("[sfgh]","")); // will replace all letters mentioned. no need to put , in between
  System.out.println(str.replaceAll("[a-z]","")); // will replace all lower case numbers only
  System.out.println(str.replaceAll("[A-Z]",""));// will replace all Upper case numbers only
  System.out.println(str.replaceAll("[^A-Z]",""));// will replace everything except A to Z (upper case
  System.out.println(str.replaceAll("[^a-z]",""));// will replace everything except a to z (upper case
  System.out.println(str.replaceAll("[^a-zA-Z]",""));// will replace everything except lower and upper case letters
  System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));//will replace everything except lower and upper case letters and numbers from 0 to 9
  
  
		
	}

}
