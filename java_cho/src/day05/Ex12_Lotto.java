package day05;

import java.util.Scanner;

public class Ex12_Lotto {

	public static void main(String[] args) {
		int lotto [] = Ex11_Again.createRandomArray(1, 45, 6);
		int bonus;
		int count = 0;
		do {
		bonus = (int)(45*Math.random()+1);	
		}while(Ex11_Again.contains(lotto, bonus));
		Ex11_Again.printArray(lotto);
		System.out.println(bonus);
		int user [] = new int [6];
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose your numbers : ");
		for(int i = 0; i < 6 ; i++) {
			user[i] = scan.nextInt();
		}
		for(int i = 0; i < 6 ; i++) {
			if(Ex11_Again.contains(lotto, user[i]))
				count++;
		}
		switch(count) {
		case 6: 
			System.out.println("No. 1!");
			break;
		case 5:
			if(Ex11_Again.contains(user, bonus)) {
				System.out.println("No. 2!");
			}
			else
				System.out.println("No. 3!");
			break;
		case 4:
			System.out.println("No. 4!");
			break;
		case 3:
			System.out.println("No. 5");
			break;
		default:
			System.out.println("No prize!");
		}
		
		

	}

}
