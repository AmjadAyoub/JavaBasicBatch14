package com.syntax.class10;

import java.util.Scanner;

public class Task6Project {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
	int numb1=50;
	int numb2=30;
	
	System.out.println("First number ="+numb1);
   System.out.println("Second number ="+numb2);	
   System.out.println();
    numb1=numb2-numb1;
    numb2=numb2-numb1;
    numb1=numb1+numb2;
    System.out.println("First number ="+numb1);
    System.out.println("Second number ="+numb2);		
	
    System.out.println("------------");
    System.out.println("Different way");
		
	int num1= 14;
    int num2=17;
    System.out.println("First number ="+num1);
    System.out.println("Second number ="+num2);

    num1=num1-num2; //4
    num2=num1+num2; //5
    num1=num2-num1; //1
    System.out.println();
    System.out.println("First number ="+num1);
    System.out.println("Second number ="+num2);

	}

}
