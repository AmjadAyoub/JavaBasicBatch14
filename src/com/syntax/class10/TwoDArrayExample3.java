package com.syntax.class10;

public class TwoDArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = {

                { "Usa", "Canada" }, // 1 array with index 0
                { "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
                { "Ethiopia", "Egypt", "Kenya" }, 
                { "Germany", "Turkiye", "Moldova", "Ukraine" },
                { "Kazakhstan", "Afghanistan", "Korea" } };

        System.out.println(" ------- getting all values from 2d array using for each loop -----");

        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
            
            for (int i = 0; i < countries[i].length; i++) { // second row
                System.out.print(countries[1][i] + " ");
            }
        }
	
                             // we cannot use enhanced loop array if we want to print one row from the 2D arrays
}

