package day06;

import java.util.Arrays;
import java.util.Scanner;

import day05.Ex11_Again;

public class Ex07_BaseballGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] =  Ex11_Again.createRandomArray(1, 9, 3);
		int user[] = new int[3];
		int count = 0;
		System.out.println(Arrays.toString(arr));
		while(equalp(arr, user)!=3)
		{
			System.out.print("Enter a sequence of 3 numbers from 1 to 9 (Ex. 4 2 1) : ");
			for(int i=0; i<3; i++) {
				user[i] = scan.nextInt();
			}
			System.out.println(Arrays.toString(user));
			for(int i = 0; i < 3 ; i++) {
				if(Ex11_Again.contains(arr, user[i]))
					count++;
			}

			// System.out.println(equalp(arr, user));
			
			switch(count) {	
			case 3:
				if(equalp(arr, user) == 3) 
					System.out.println("3S");
				
				if(equalp(arr, user) == 1)
					System.out.println("1S2B");
			
				if(equalp(arr, user) == 0)
					System.out.println("3B");
				break;
			case 2:
				if(equalp(arr, user) == 2)
					System.out.println("2S");
				if(equalp(arr, user) == 1)
					System.out.println("1S1B");
				if(equalp(arr, user) == 0)
					System.out.println("2B");
				break;
			case 1:
				if(equalp(arr, user) == 1)
					System.out.println("1S");
				if(equalp(arr, user) == 0)
					System.out.println("1B");
				break;
			default: 
				System.out.println("3O");
	
			
			}

		}

	}
	public static int equalp(int arr1[], int arr2[]) {
		int equalp = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i])
				equalp++;
		}
		return equalp;
	}
}
