package com.syntax.class06;

import java.util.Scanner;

public class HomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your birth month?");
		String month=scan.next();
		String season="Invalid";
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
		  season="Summer";
		
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Autumn";
		} else {
			System.out.println("Please enter a correct month");
		}
		System.out.println("You were born in "+season+" season");
		
		System.out.println("------------------------------------------");
		
		System.out.println("Please Enter your Quiz Score?");
        double quiz = scan.nextDouble();
        System.out.println("Please Enter your mid term Score?");
        double midterm = scan.nextDouble();
        System.out.println("Please Enter your Final Score?");
        double Final = scan.nextDouble();
        double average;
        average = (quiz+midterm+Final)/3;
        String grade="Invalid";

        if(average>=90 && average<=100) {
            grade = "A";
        }else if(average>=70 && average<90) {
            grade = "B";
        }else if(average>=50 && average<70) {
            grade = "C";
        }else if(average<50 && average>0) {
            grade = "F";
        }else {
            System.out.println("Please enter valid score!");
            
        }
        System.out.println("Grade: "+grade);
		
	}

}
