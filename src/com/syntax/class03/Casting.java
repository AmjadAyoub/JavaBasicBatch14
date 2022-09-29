package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number= (int)15.2;
		System.out.println(number);
		
		
		byte box1=127;
		short box2=3333;
		
		byte smallerbox=(byte)box2;   // trying to put short box2 in byte box, that is why it does not work, gave us 5,will learn it later why 5)
		System.out.println(smallerbox);
		
		// converting smaller data type to larger is called implicit (widening), and other way is called explicit(Narrowing)
		
		char a=(char)65;
		System.out.println(a);
		
		char b=(char)69;
		System.out.println(b);
		
		
	}

}
