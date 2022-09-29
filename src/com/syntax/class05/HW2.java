package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in March, April, May → season =”Spring” 
           if user is born in June, July, August → 
           season =”Summer”  etc …
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scan.next();
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("It is Winter");
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("It is Spring");
		} else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("It is Summer"); 
		} else {
			System.out.println("It is Autumn");
		}
		

	}

}
