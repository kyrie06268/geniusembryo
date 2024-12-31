package day02;

import java.util.Scanner;

public class Ex16_Continued {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num = scan.nextInt();
		if(num % 6 == 0) {
			System.out.println(num + " is a multiple of 6.");
		}
		else if(num % 2 == 0) {
			System.out.println(num + " is a multiple of 2.");
		}
		else if(num % 3 == 0) {
			System.out.println(num + " is a multiple of 3.");
		} 
		else {
			System.out.println(num + " is not a multiple of 2 or 3.");
		}
	}
}