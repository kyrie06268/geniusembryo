package day02;

import java.util.Scanner;

public class Ex10_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num1 = scan.nextInt();
		System.out.println(num1 + " is entered.");
		System.out.print("Enter a real number : ");
		double num2 = scan.nextDouble();
		System.out.println(num2 + " is entered.");
		System.out.print("Enter a word :");
		String str = scan.next();
		System.out.println(str + " is entered.");
		System.out.print("Enter a character : ");
		char ch = scan.next().charAt(0);
		System.out.println(ch + " is entered.");
		scan.nextLine();
		System.out.print("Enter a sentence : ");
		String str2 = scan.nextLine(); // stores enter key
		System.out.println(str2 + " is entered.");
	}

}
