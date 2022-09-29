package reviewclass3;

import java.util.Scanner;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner (System.in);
     System.out.println("Are you from batch 14?");
     String batch14=scanner.next();
     if(batch14.equalsIgnoreCase("yes")) {         // WE ENTER IgnoreCase to avoid case sensitivity
    	 System.out.println("You are amazing");
     } else {
    	 System.out.println("You are good");
     }

	}

}
