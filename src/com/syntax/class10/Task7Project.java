package com.syntax.class10;

import java.util.Scanner;

public class Task7Project {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		int count = 0;

		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0)
					count++;

			}
			if (count == 2) {
				System.out.println(number + " is a prime number");
			} else {
				System.out.println(number + " is not a prime number");
			}
		}
		else {System.out.println(number + " is not a prime number");
			
		}
		
		System.out.println();
		System.out.println("different way");
		
		int num = 9;
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        if(isPrime) {
            System.out.println(num+" is Prime");
        }else {

            System.out.println(num+" is not Prime");
	}

}
}
