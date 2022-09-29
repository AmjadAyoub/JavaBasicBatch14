package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		boolean rain=false;
		if (!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day="Monday";
		
		if(!day.equals("Sunday")) {
			System.out.println("Today is not Sunday");
		}
		
		boolean checkboxSelected=true; // true means checkbox is selected
		if(!checkboxSelected) {
			System.out.println("I will click and select it");
		}
		boolean checkboxSelected1=false; // true means checkbox is selected
		if(!checkboxSelected1) {
			System.out.println("I will click and select it");
		}
		

	}

}
