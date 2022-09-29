package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask user to input inputs the current time (use 24 hour format).
		Based on the given time define:
			if hour is between 1-11 --> Morning
			if hour between 12-15 --> Afternoon
			if hour between 16-20 --> Evening
			if hour between 21-24 --> Night
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the currect time");
		int hour=scan.nextInt();
		if(hour>=1 && hour<=11) {
			System.out.println("It is morning");
		}else if(hour>=12 && hour<=15) {
			System.out.println("It is afternoon");
		} else if (hour >=16 && hour <=20) {
			System.out.println("It is evening");
		} else if(hour>=21 && hour <=24) {
			System.out.println("It is night");
		}
			
		}
		
			

	}


