package day09;

import java.util.Scanner;

public class Ex02_String2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a file name to edit : ");
		String fileName = scan.next();
		System.out.print("Enter a new file name : ");
		String newName = scan.next();
		int n = fileName.lastIndexOf(".");
		System.out.println(n);
		System.out.print("The file name has been changed to : ");
		System.out.print(fileName.replace(fileName.substring(0, n), newName));
		
				
	}

}
