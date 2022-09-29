package com.syntax.class06;
import java.util.Scanner; 
public class Repl36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter two words");
	    String word1=scan.next();
	    String word2=scan.next();
	    System.out.println("Please enter two numbers");
	    int int1=scan.nextInt();
	    int int2=scan.nextInt();
	    if(int1==int2) {
	    	if(word1.equals(word2)) {
	    		System.out.println("AND");
	    	} else {
	    		System.out.println("OR");
	    	}
	    	
	    	
	    	
	    } else if("word1"!="word2") {
	    	System.out.println("NONE");
	    }
	    
	    
		
	

}
}
