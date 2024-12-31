package day02;

import java.util.Scanner;

public class Ex15_SwitchGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your score:");
		int score = scan.nextInt();
		//division
		switch(score / 10) {
		case 9, 10 : System.out.println("Your letter grade for " + score + " is A.");
		break;
		case 8 : System.out.println("Your letter grade for " + score + " is B.");
		break;
		case 7 : System.out.println("Your letter grade for " + score + " is C.");
		break;
		case 6 : System.out.println("Your letter grade for " + score + " is D.");
		break;
		case 5, 4, 3, 2, 1, 0 : System.out.println("Your letter grade for " + score + " is F.");
		break;
		default : System.out.println("N/A");
		break;
		
		
		}

	}

}
