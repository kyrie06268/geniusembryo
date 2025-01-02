package day03;

import java.util.Scanner;

public class Ex02_Test {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a month : ");
	int month = scan.nextInt();
	
	switch(month) {
	case 1, 3, 5, 7, 8, 10, 12 : 
		System.out.println(month + "month has 31 days.");
	break;
	case 4, 6, 9, 11 :
		System.out.println(month + "month has 30 days.");
	break;
	case 2: 
		System.out.println(month + "month has 28 days.");
	break;
	default:
		System.out.println("N/A.");
	break;
	}
	

	}

}
