package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
	//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
 
		
		char a []=new char[6];
		a[0]='A';
		a[1]='B';
		a[2]='C';
		a[3]='D';
		a[4]='E';
		a[5]='F';
		
		System.out.println(a[1]);
		
		char b []= {'A','B','C','D','E','F'};
		System.out.println(b[1]);
		
		System.out.println("-----------------");
		
		char [] letters= {'A','B','C','D','E','F'};
		for(int i=0; i<letters.length; i++) {
			System.out.println(letters[i]+" ");
		}
		

	}

}
