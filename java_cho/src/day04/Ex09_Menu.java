package day04;

import java.util.Scanner;

public class Ex09_Menu {

	public static void main(String[] args) {
	/* Menu
	 * 1. Run Program
	 * 2. Terminate
	 * Choose menu : 1
	 * Enter a character : 1
	 * Enter a character : a
	 * Enter a character : q -> back to menu
	 * Choose menu : 2
	 * Terminate
	 * 
	 * */
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Menu");
		System.out.println("1. Run program.");
		System.out.println("2. Terminate.");
		System.out.print("Choose menu : ");
		char ch1 = scan.next().charAt(0);
		char ch2;
		if(ch1 == '1') {
		do{System.out.print("Enter a character : ");
		ch2 = scan.next().charAt(0);
		}while(ch2 != 'q');
		
		
		}
		if(ch1 == '2') {
			System.out.println("Terminated.");
			break;
			
		}
		}
		
			

	}

}
