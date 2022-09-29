package com.syntax.class08;

public class Example {

	public static void main(String[] args) {
		// I want to print numbers from 1 to 20 except number 3, 7 and 11

		for (int i=1; i<=20; i++) {

            if(i==3 || i==7 || i==11) {
                continue;
            }

            System.out.print(i+" ");
	}

}
}