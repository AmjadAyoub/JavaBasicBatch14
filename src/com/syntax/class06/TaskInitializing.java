package com.syntax.class06;

import java.util.Scanner;

public class TaskInitializing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		double quiz=scan.nextDouble();
		System.out.println("Please enter your mid term score");
		double midterm=scan.nextDouble();
		System.out.println("Please enter your final score");
		double Final=scan.nextDouble();
		double average;
		average=(quiz+midterm+Final)/3;
		String grade="Null";                // initializing the variable
		if(average>=90 && average<=100) {
			grade="A";
		} else if(average>=70 && average <90) {
			grade="B";
		} else if(average>=50 && average<70) {
			grade="C";
		} else if(average<50) {
			grade="F";
		} else {
			System.out.println("Please enter a valid score");
			grade="Invalid";
			
			
		}  System.out.println("Grade: "+grade);
		
		
		
		

	}

}
