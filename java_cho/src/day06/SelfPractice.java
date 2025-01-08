package day06;

import java.util.Arrays;

public class SelfPractice {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int tail[] = new int[3];
		System.arraycopy(arr, 2, tail, 0, 3);
		System.out.println(Arrays.toString(tail));
		
		
		
		
	}

}
