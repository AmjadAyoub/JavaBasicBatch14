package com.syntax.class13;

import Utils.StringUtils;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // to print the index number of a certain character
		String str1="Thor love and thunder";
		for (int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)=='o' ) {
				System.out.println(i); } }
				
				
				String str="Thor love and thunder";
		        StringUtils strUtils=new StringUtils();
		        strUtils.printAllIndexes(str, 'e');
			}
		
	}


