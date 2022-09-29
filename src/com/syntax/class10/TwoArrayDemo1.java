package com.syntax.class10;

public class TwoArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries= {
				{"Usa","Canada"},  // 1st array with index 0
				{"Peru","Brazil","Colombia","Ecuador"},  // 2nd array with index 1
				{"Ethiopia","Egypt","Kenya"},
				{"Germany","Turkey","Moldova","Ukraine"},
				{"Lebanon","Korea"}
				
				
		};
		System.out.println(countries.length);  // number of rows(arrays) 5 rows
		
		System.out.println("------------------");
		
		int arr=countries[0].length; // No of elements in array 1
		System.out.println(arr);
		
		System.out.println("----------------");

		
		int arr1=countries[1].length;  // No of elements in array 2
		System.out.println(arr1);
		System.out.println("----------------");
		
		for(int r=0; r<countries.length; r++) {
			for(int c=0; c<countries[r].length; c++) {
				
				System.out.print(countries[r][c]+ " ");
				
			
			}
			System.out.println();
			
			}
		
		}
		
	}
	

