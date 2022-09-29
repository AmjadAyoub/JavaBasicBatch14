package com.syntax.class07;

public class HW4 {

	public static void main(String[] args) {
		// 4. Print odd numbers between 20 and 50 (2 ways)
		
		int i=21;
		while(i<=50) {
			System.out.print(i+ " ");
			i+=2;
		}
		
		System.out.println("Another way");
		
		int n=20;
		while(n<=50) {
			if(n%2!=0) {
				System.out.print(n+ " ");
				
			}
			n++;
		}
		
		

	}

}
