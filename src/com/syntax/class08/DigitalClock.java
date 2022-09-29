package com.syntax.class08;

public class DigitalClock {

	public static void main(String[] args) {
		// Create a digital clock using nested loops
		// if you can, try to have a clock that would show 2 digits for hour and 2
		// digits for minutes
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.println(i + " : " + j);

			}
		}

	}

}
