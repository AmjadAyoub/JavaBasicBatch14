package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("Shah")) {
			System.out.println("I found it");  // true
			
			if(str==str3) { 
				System.out.println("I found it");	 // false because the ID # is different
				
				// we better always use equals method not ==
				
				if(str3.equalsIgnoreCase("shah")) {
					System.out.println("I found it with equalsIgnoreCase");  // true
				}
		}
		}
	}

}


