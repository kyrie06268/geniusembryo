package day06;

import java.util.Arrays;
import java.util.Collections;

public class Ex06_BubbleSort {
	public static void main(String[] args) {
		int arr [] = {1, 2, 2, 3, 9, 2, 4, 6, 8, 10};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-(i+1); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		Ex05_EnhancedFor.print2(arr);
		int arr2 [] = {1, 2, 5, 8, 9, 2, 4, 6, 8, 10};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		Integer arr3 [] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		Arrays.sort(arr3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));
	}
}
