package day05;

import java.util.Scanner;

public class Homework1WithMethod {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		char m;
		int maxCount = 0;
		
		do {
			printMenu();
			m = scan.next().charAt(0);
			runMenu(m, maxCount);	
		}while(m != '3');

	}
	public static void printMenu() {
		System.out.println("Menu");
		System.out.println("1. UpDown game");
		System.out.println("2. Best Record");
		System.out.println("3. End Program");
		System.out.print("Enter an option : ");
}
	public static int runMenu(char m, int maxCount) {
		switch(m) {
		case '1' :
			int count = playGame();
			maxCount = recordGame(maxCount, count);
			break;
		case '2' :
			printRecord(maxCount);
			
			break;
		case '3' :
			System.out.println("Terminated.");
			break;
		default :
			System.out.println("N/A");
		}
		return maxCount;
	}
	private static int recordGame(int maxCount, int count) {
		if(maxCount == 0) {
			return count;
		}
		if(maxCount > count) {
			return count;
		}
		return maxCount;
		// return minCount > count ? count:maxCount;
	}
	public static int playGame() {
		
		int r = (int)(Math.random()*100+1);
		System.out.println(r);
		System.out.print("Guess the number : ");
		int input, count =0;
		do {
		input = scan.nextInt();
		count++;
		if(input > r) {
			System.out.println("Down!");
		}
		else if(input < r) {
			System.out.println("Up!");
		}
		else
			System.out.println("Correct!");
		}while(r != input);
		return count;
	}
	public static void printRecord(int maxCount) {
		System.out.println("Retrieving your best record...");
		if(maxCount != 0) {
			System.out.println("Your best record is : " + maxCount);
		}
		else { 
			System.out.println("You haven't played yet.");
		}
		System.out.println("Press Enter to go to menu : ");
		scan.nextLine();
		scan.nextLine(); 
		
	}
}
