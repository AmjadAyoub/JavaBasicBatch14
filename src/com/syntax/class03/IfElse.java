package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double money = 5;
		boolean isHungry = true;
		double kfcBurger = 11;

		if (money > kfcBurger) {
			System.out.println("yayy i can enjoy a burger");
		}

		else {
			System.out.println("I should make something at home");
		}

		if (isHungry) {
			System.out.println("If block");
		} else {
			System.out.println("else block");
		}
		
		int cash=65000;
		
		if (cash==65000) {
			System.out.println("I need to buy a tesla");
		}
		
		int number=19;
		if (number!=18) {
			System.out.println("this number is not 18");
		}
		
		
		
		int day=3;
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");
		} else {
			System.out.println("Other day");
		}
		
		// for Non Primitives we do this
		String name="Wahid";
		if(name.equals("Wahid")) {
			System.out.println("I love Mondays");
			
		}else {
			System.out.println("I love Weekends");
		}
		

	}

}
