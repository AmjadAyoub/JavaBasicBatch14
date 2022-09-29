package com.syntax.class10;

public class Task11Project {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?
String [] names= {"Amjad","Farah","Mo", "Waad", "Amjad", "Waad", "Farah"} ;


          int duplicate=0;
		for (int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.print(names[i]+" ");
					duplicate=duplicate+1;
				}
			}
			
				
				
			} if (duplicate==1) {
				System.out.println(" is the repeating word" );
			} else if ((duplicate >1)) {
				System.out.println("are the repeating words");
			} else {
				System.out.println("There is no repeating words");
			}
			
				
			}
		
	}

		
		
	


