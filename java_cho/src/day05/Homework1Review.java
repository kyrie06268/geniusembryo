package day05;

import java.util.Scanner;

public class Homework1Review {

	public static void main(String[] args) {
		char menu; //initializing is needed when using inside a loop.
		Scanner scan = new Scanner(System.in);
		int maxCount = 0;//Integer.MAX_VALUE; set to infinity.
		do {
			System.out.println("Menu");
			System.out.println("1. UpDown game");
			System.out.println("2. Best Record");
			System.out.println("3. End Program");
			System.out.print("Enter an option : ");
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1':
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
				if(maxCount == 0 || maxCount > count) {
					maxCount = count;
					}
				break;
			case '2':
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
				break;
			case '3':
				System.out.println("Terminated.");
				break;
			default:
				System.out.println("N/A");
				break;
			}
		}while(menu != '3');

	}

}
