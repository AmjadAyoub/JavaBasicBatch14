package reviewclass3;

public class LogicalOperator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String country="X";
    
    /*
     * if(country.equals("Turkie") || country.equals("Japan")||country.equals("Spain")
     * 
     * instead or writing all the countries that can enter USA, we enter ! to mention the country that cannot enter USA.
     */
    
    
    if(!country.equals("Korea")) {
    	System.out.println("Welcome to USA");
    }
	}

}
