package day04;

import java.util.Scanner;

public class Ex09_Again {

	public static void main(String[] args) {
		char menu;
		Scanner scan = new Scanner(System.in);
		
		do {
			printMenu();
			menu = scan.next().charAt(0);
			runMenu(menu);
			
			
		}while(menu != '2');

	}
public static void printMenu() {
	System.out.println("Menu");
	System.out.println("1. Run program.");
	System.out.println("2. Terminate.");
	System.out.print("Choose menu : ");
}

public static void runMenu(char menu) {

	switch(menu) {
case '1' :
	program();
	break;
case '2' :
	System.out.println("Terminated.");
	break;
default: 
	System.out.println("N/A");
	break;
}
}
	
	public static void program() {
	Scanner scan = new Scanner(System.in);
	char ch;
	do {
		System.out.println("Enter a character : ");
		ch = scan.next().charAt(0);
	}while(ch != 'q');
	}
}
