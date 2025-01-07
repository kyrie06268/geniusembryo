package day04;

import java.util.Scanner;

public class Ex10_Homework1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int best = 100;
		int count = 0;
		while(true) {
			System.out.println("Menu");
			System.out.println("1. UpDown game");
			System.out.println("2. Best Record");
			System.out.println("3. End Program");
			System.out.print("Enter an option : ");
		char ch1 = scan.next().charAt(0);
			
		
		if(ch1 == '1') {
		final int r = (int)(1+100*(Math.random()));
		System.out.println(r);
		int num = 0;
		count = 0;
		while(num != r) {
		System.out.print("Enter a number between 1 and 100 : ");
			num = scan.nextInt();
			count++;
			if(num > r) {
			System.out.println("Down!");
			
			}
			else if(num < r) {
			System.out.println("Up!");
			
			}
			else
			{
			System.out.println("Correct!");
			
			}
		}
		
	}
		if(ch1 == '2') {
			if(count == 0) {
				System.out.println("You haven't played yet!");
				}
			else { 
				if(best >= count) {
				best = count;
				System.out.println("Your new best record is : "+ count);
			}	
				else
				System.out.println("Your best record is : "+ best);
			}
				
			}
		if(ch1 == '3') {
			System.out.println("Terminated.");
			break;
			
		}			
		}
		
		}
		
	}
		
			

	