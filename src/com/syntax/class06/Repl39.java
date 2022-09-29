package com.syntax.class06;

import java.util.Scanner;

public class Repl39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
	    System.out.println("Please enter your mark");
	    int mark=scan.nextInt();
	    char grade='\u0000';
	    { if(mark>0 && mark<25) {
	      grade='F';
	    } else if(mark>24 && mark<45) {
	      grade='E';
	    } else if(mark>44 && mark<50) {
	      grade='D';
	    } else if(mark>49 && mark<60) {
	      grade='C';
	    } else if(mark>59 && mark<81) {
	      grade='B';
	    } else if(mark>80) {
	      grade='A';
	    } 
	    
	      System.out.println("Your grade is "+grade);
	    
	    }   if (mark<1 || mark>100) {
	      System.out.println("Please enter valid mark");
	    }
	    

	}

}
