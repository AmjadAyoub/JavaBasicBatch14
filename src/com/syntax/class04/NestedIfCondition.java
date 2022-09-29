package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=5;
		String day="Monday";      // if outer condition is true, then only inner condition will be checked. it is like the main door.
		
		if(day.equals("Monday")) {    // called outer condition( as string is a non primitive ,we cannot use == sign. so we have to use .equals)
			
			if(time>7) {              // inner condition
				System.out.println("Lets go to office");
			} 
			if(time<6) {             // inner condition
				System.out.println("Lets sleep more");
			}
		}

	}

}
