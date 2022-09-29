package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// Loop inside another loop
		for (int i=1; i<3; i++) {              // OUTER LOOP CONTROLS INNER LOOP
			System.out.println("Hello");
			for (int j=1; j<=3; j++) {           //INNER  LOOP DEPENDS ON OUTER LOOP
				System.out.println("Bye");
			}
		}

	}

}
