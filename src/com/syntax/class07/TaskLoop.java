package com.syntax.class07;

public class TaskLoop {

	public static void main(String[] args) {
		//Print all numbers from 50 to 20
		// print all even numbers from 1 to 20
		
		int i=50;
		while(i>=20) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("----------------------------");
		int n=2;
		
		while(n<=20) {
			System.out.println(n);
			n+=2;
		}
		
		System.out.println("Another Way");
		
		int v=1;
		while (v<=20) {
			if (v%2==0) {
				System.out.print(v + " ");
				
			}
			v++;
		}
		
		
		
	}

}
