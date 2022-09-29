package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		int [] nums=new int[3];
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);  // the element 0 is not stored any value, so the outcome is zero

		
		String [] colors=new String[4];
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow";  
		// gives an error because the size of the array is 3 elements only
		System.out.println(colors[3]);
		
		
		
		
		
		
		
		
	}

}
