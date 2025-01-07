package day06;

public class Ex02_ArrayMax {

	public static void main(String[] args) {
		int arr [] = {1, 10, 9, 20, 3, 4};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) 
				max = arr[i]; 
		}
		System.out.println(max);
		System.out.println(max(arr));
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= min) 
				min = arr[i]; 
		}
		System.out.println(min);
		
	}
public static int max(int arr[]) {
	int max = arr[0];
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] >= max) 
			max = arr[i]; 
	}
	return max;
}
}
