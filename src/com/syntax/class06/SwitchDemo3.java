package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we need to ask a user where he/she is from
		//based on the country, we need to define favorite food
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");	
		
		String country=in.nextLine();
		String favoriteFood;
		switch(country) {
		case "usa":
			favoriteFood="burgers and fries";
			break;
		case "Lebanon":
			favoriteFood="Shawarma";
			break;
			default:
				favoriteFood="Unknown";
				break;
			
			}
		System.out.println("You are from "+country+" and you favorite food is "+favoriteFood);
		
		
		
		
		

	}

}
