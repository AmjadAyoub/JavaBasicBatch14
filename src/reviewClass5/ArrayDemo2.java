package reviewClass5;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double size=10;
        int [] arr=new int[10];

        for(int i=0; i<arr.length;i++) {
            arr[i]=20;
        }

        System.out.println(Arrays.toString(arr));
	}

}