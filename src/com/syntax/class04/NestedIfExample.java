package com.syntax.class04;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double moneyInMyAccount=20000;
		String season="Spring";
		
		if(season.equals("Spring"))
				{
			if(moneyInMyAccount>30000)
			{
				System.out.println("Lets go for vacation");
			}
			else
			{
				System.out.println("I need to save more");
				
			}
					
				}
				
	}

}
