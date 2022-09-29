package com.syntax.class06;

public class Initializing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//introducing a variable and initialized
		//int = 0
		//double=0.0
		//string= "Null"
		
		int n1=100;
		int n2=100;
		int n3=100;
		
		int largest = 0;  // initializing a variable
		
		if(n1>n2 && n1>n3) {
			largest=n1;
		} else if (n2>n3 && n2>n1) {
			largest=n2;
		}else if (n3>n1 && n3>n2) {
			largest=n3;
		} else {
			System.out.println("All numbers are equal");  // if the 3 numbers are equal, then largest number is equal to zero.
		}
		System.out.println(largest+" is the largest"); 
		if(largest!=0) {
			if(largest%2==0) {
				System.out.println(largest+" is even");
			} else {
				System.out.println(largest+" is odd");
			}
		}
		
			
		
				
			}
		
	}

	

		
	