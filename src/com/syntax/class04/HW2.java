package com.syntax.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
	//Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is higher than 
	//4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house, if price of the house is 
    //larger than 200000 than user will take a loan, otherwise user will pay cash
    Scanner rate=new Scanner(System.in);
    System.out.println("What is the mortgage rate?");
    double mortgageRate=rate.nextDouble();
    if(mortgageRate<=4.5)
    { System.out.println("I will consider buying a house"); 
    System.out.println("What is the price of the house?");
    int mortgagePrice=rate.nextInt();
     if(mortgagePrice>200000)
    { System.out.println("I will take a loan");
    } else {
    	System.out.println("I will pay cash to buy the house");
    }
    }
	else
      {
    	System.out.println("I will not buy a house");
    }
 
     		
	}
	
	
    }



