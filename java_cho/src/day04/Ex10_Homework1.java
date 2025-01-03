package day04;

import java.util.Scanner;

public class Ex10_Homework1 {

	public static void main(String[] args) {
	/* Write a program that does the following.
	 * Menu
	 * 1. Run UpDown game.
	 * 2. Best record.
	 * 3. End program.
	 * Select 2 : No record.
	 * 
	 * */
	Scanner scan = new Scanner(System.in);
	System.out.print("Select an option : ");
	char op;
	do {
		
		op = scan.next().charAt(0);
		
		
	}while(op != '2');
	
	}
public static void upDownGame() {
	Scanner scan = new Scanner(System.in);
	
	final int r = (int)(1+100*(Math.random()));
	// System.out.println(r);
	int count = 0;
	int num = 0;
	while(num != r) {
	System.out.print("Enter a number between 1 and 100 : ");
		num = scan.nextInt();
	if(num > r)
		System.out.println("Down!");
	else if(num < r)
		System.out.println("Up!");
	else
		{
		System.out.println("Correct!");
		}
		count++;
	}
}
public static void printMenu() {
	System.out.println("Menu");
	System.out.println("1. UpDown game");
	System.out.println("2. Best Record");
	System.out.println("3. End Program");
}
public static void runMenu(char op) {
	switch(op) {
	case '1': upDownGame();
		break;
	case '2': 
		int count = 0;
		if(count == 0)
			System.out.println("You haven't played yet.");
		else
			System.out.println("Your best record is : " + count);
	break;
	case '3': 
		System.out.println("Terminated.");
	break;
	}
}
}
