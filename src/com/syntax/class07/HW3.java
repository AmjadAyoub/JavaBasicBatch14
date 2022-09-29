package com.syntax.class07;

public class HW3 {

	public static void main(String[] args) {
		// 3. Print even numbers from 20 to 1 (2 ways)
		int i=20;
		
		while(i>=1) {
			if(i%2==0) {
			System.out.print(i+ " ");
		}
			i--;
		}

		
		System.out.println("Another way");
		
		int n=20;
		while(n>=1) {
			System.out.print(n+ " ");
			n-=2;
		}
	}

}
