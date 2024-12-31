package day02;
import java.util.Scanner;
public class Ex07_IfStatement3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = keyboard.nextInt();
		if(num > 0) {
			System.out.println(num + " is positive.");
		}
		else if(num < 0) {
			System.out.println(num + "is negative.");
		}
		else {
			System.out.println(num + "is zero.");
		}

	}

}
