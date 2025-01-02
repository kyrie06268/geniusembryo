package day03;

import java.util.Scanner;

public class Ex01_Test {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter three scores : ");
	int s1 = scan.nextInt();
	int s2 = scan.nextInt();
	int s3 = scan.nextInt();
	int sum = s1 + s2 + s3;
	System.out.println("The sum is " + sum + " and the average is " + (double)sum/3.);
	}

}
