package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08_ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 4 digit number : ");
		int user = scan.nextInt();
		// System.out.println(user);
		int arr[] = new int[4];
		int usernum = 0;
		int temp = user;
		for(int i = 0; i < arr.length; i++) {
			arr[3-i] = (user % pow(10, 4-i))/pow(10, 3-i);
		}
		for(int i = 0; i < arr.length; i++) {
			usernum +=arr[i]*pow(10,3-i);
		}
		System.out.println(usernum);
		System.out.println("---------------------------------");
		while(temp > 0) {
			System.out.print(temp % 10);
			temp /=10;
		}
		// 4321
		// arr[3] = (user % 10000)/1000;
		// arr[2] = (user % 1000)/100;
		// arr[1] = (user % 100)/10;
		// arr[0] = (user % 10);
		
		//System.out.println(Arrays.toString(arr));
		

	}
public static int pow(int a, int n) {
	int result = 1;
	for(int i =0; i<n; i++) {
		result *=a;
	}
	return result;	
}
}
