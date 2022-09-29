package reviewClass5;

import java.util.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
        int [] arr=new int[10];
        
        for(int i=0; i<arr.length;i++) {
        	int start=11;
            arr[i]=start;
            start++;
        }

        System.out.println(Arrays.toString(arr));
        
	}

}
