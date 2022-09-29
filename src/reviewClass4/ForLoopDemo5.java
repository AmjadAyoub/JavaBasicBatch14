package reviewClass4;

public class ForLoopDemo5 {

	public static void main(String[] args) {
		// I want to print this pattern 10 8 6 4 2 0
		for (int i=10; i>=0; i-=2) {    //we can use steps: i=(i-2)
			System.out.println(i);
		}

		for (int n=10; n>=0; n=(n-2)) {    //we can use steps: i=(i-2)
			System.out.println(n);
	}
		
		// print 1   3   7  9
		
		for (int x=1; x<=9; x+=2) {
			
			if(x==5) {
				continue;
			}
		}

}
}
