package com.syntax.class03;

public class TemperatureCheckTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should check if temperature is below 32 then it should print
		//“Water will freeze with temperature ”, otherwise “Water will NOT freeze with temperature ”.
		
		double temperature=33.0;
		if(temperature<32) 
		{
			System.out.println("Water will freeze with temperature "+ temperature + " degrees.");
		}
		else 
		{
			System.out.println("Water will NOT freeze with temperature "+ temperature + " degrees.");
		}
		
		
	}

}
