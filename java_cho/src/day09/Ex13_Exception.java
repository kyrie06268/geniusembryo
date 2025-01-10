package day09;

import javax.management.RuntimeErrorException;

public class Ex13_Exception {
	public static void main(String[] args) {
		int arr [] = new int[5];
		try {
		//arr = expand(arr, -10);
		arr = null;
		arr = expand(arr, 10);}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		};
		
		
	}
	public static int [] expand(int [] arr, int addSize) {
		 try {	
			 
			 int temp [] = new int [arr.length + addSize];
			 System.arraycopy(arr, 0, temp, 0, arr.length);
			 arr = temp;
		if(addSize < 0) {
			throw new RuntimeException("Cannot shrink array.");
		}	 
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Index is out of bound.");
		 }catch(NullPointerException e) {
			 System.out.println("Array is null.");
		 }catch(NegativeArraySizeException e) {
			 System.out.println("Array size is negative.");
		 }
		 
		return arr; 
	}
	
}
