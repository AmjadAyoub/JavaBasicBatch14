package com.syntax.class06;

import java.util.Scanner;

public class Repl38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("Is it weekend?");
	    boolean weekend=scan.nextBoolean();
	    
	    if(weekend) {
	      System.out.println("Today you will be learning Java");
	    } else {
	    	System.out.println("Today you will be learning manual testing");
	    }
	    System.out.println("--------------------------");
	    System.out.println("DIFFERENT WAY");
	    
	    String subject="Null";
	    if(!weekend) {
		      subject="manual testing";
		    } else {
		    	subject="Java";
		    }
	    System.out.println("Today you will be learning "+subject);
	    

	}

}
