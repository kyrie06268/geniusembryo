package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_GradeBook {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int scores [] = new int [5];
		String names [] = new String[5];
		int input;
		clearNames(names);
		
		do{
			System.out.println("MENU");
			System.out.println("1. Add score.");
			System.out.println("2. Open gradebook.");
			System.out.println("3. Terminate.");
			System.out.print("Enter option : ");
			input = scan.nextInt();
			switch(input) {
			case 1:
				addScore(names, scores);
				break;
			case 2:
				print(names, scores);
				break;
			case 3:
				System.out.println("Terminated.");
				break;
			default:
			}
		}while(input != 3);
		
	}
public static void clearNames(String names[]) {
	for(int i = 0; i < names.length; i++) {
		names[i] = "0";
	}
}
public static void addScore(String names[], int scores[]) {
	System.out.print("Enter name : ");
	scan.nextLine();
	String name = scan.nextLine();
	
	System.out.print("Enter score : ");
	int score = scan.nextInt();
	for(int i = 0; i < names.length; i++) {
		if(names[i].equals("0")) {
			names[i] = name;
			break;
			}
	}
	for(int j = 0; j < scores.length; j++) {
		if(scores[j] == 0) {
			scores[j] = score;
			break;
			}
	}
	}
public static void print(String names[], int scores[]) {
	for(int i = 0; i < names.length; i++) {
	System.out.println(names[i] + "'s Korean score is : " + scores[i]);
	}
}

}
