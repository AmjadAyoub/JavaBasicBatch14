package com.syntax.class06;

import java.util.Scanner;

public class Repl36Mo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		   System.out.println("Please enter two strings and two interger");
		  String word1=input.nextLine();
		  String word2=input.nextLine();
		  int num1=input.nextInt();
		  int num2=input.nextInt();
		    String output = null;

		         if (word1.equals(word2) && num1 == num2) {
		            output = "AND";

		        } else if (num1 == num2 || word1.equals(word2)) {
		            output = "OR";

		        } else if (!(num1 == num2) && !word1.equals(word2)) {
		            output = "NONE";
		        }
		        System.out.println(output);
	}

}
