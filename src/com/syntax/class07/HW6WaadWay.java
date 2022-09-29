package com.syntax.class07;

import java.util.Scanner;

public class HW6WaadWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        double price = 7.5;
        double pay = 0;
        do {
            System.out.println("Pay for coffee");
            pay = input.nextDouble();

            if(pay>price) {
                System.out.println("pay less");

            }else if(pay<price) {
                System.out.println("pay more");
            }else if (pay==price) {
                System.out.println("Please enjoy your coffee");
            }

            } while (pay != price);
	}

}
