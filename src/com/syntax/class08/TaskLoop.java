package com.syntax.class08;

import java.util.Scanner;

public class TaskLoop {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and odd numbers.
		
		//Create a secret number and let user guess the secret number.
		//once user guessed your secret number-> program says you won
		
		int oddSum = 0;
	    int evenSum = 0;
	    for(int n=1; n<=10; n++) {
	    	if(n%2!=0) {
	    		oddSum+=n;
	    	  				
	    		
	    	} else  {
	    		evenSum+=n;
	    		
	    	}
	    }
	    System.out.println("SUM OF ODD NUMBERS = " + oddSum);
        System.out.println("SUM OF EVEN NUMBERS = " + evenSum);
		
		
		
		
		
		
		
		
		
		
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
		
	
        
        System.out.println("-------------------------------");
        
        Scanner input = new Scanner(System.in);
        int secret = 1234;
        int guess;

        do {
            System.out.println("Please guess the secret number: ");
            guess = input.nextInt();

        }while(guess != secret);

        System.out.println("You won!");
        
	}
}
