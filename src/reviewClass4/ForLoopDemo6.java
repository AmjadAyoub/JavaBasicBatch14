package reviewClass4;

public class ForLoopDemo6 {

	public static void main(String[] args) {
		//  print 1   3   7  9
		
		for (int x=1; x<=9; x+=2) {
			
			if(x!=5) {
				System.out.println(x);
			}
		}                                        //  second way
       for (int i=1; i<=9; i+=2) {
			
			if(i==5) {
				continue;
			}
				System.out.println(i);
	}

}
}
