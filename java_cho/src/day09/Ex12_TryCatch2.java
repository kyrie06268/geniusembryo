package day09;

import java.util.Scanner;

public class Ex12_TryCatch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first nuumber : ");
		int n1 = scan.nextInt();
		System.out.print("Enter an operator : ");
		char op = scan.next().charAt(0);
		System.out.print("Enter second number : ");
		int n2 = scan.nextInt();

		switch(op) {
		case '+': System.out.println(n1+n2);
			break;
		case '-':System.out.println(n1-n2);
			break;
		case '*':System.out.println(n1*n2);
			break;
		case '/':
			try {
				System.out.println((double)n1/n2);
			}catch(ArithmeticException e) {
				System.out.println("Can't divide by 0.");
			};
			break;
		case '%':
			try {
				System.out.println(n1%n2);
			}catch(ArithmeticException e) {
				System.out.println("Can't divide by 0.");
			};
			break;
		default:
		}
		
		
	
	}

}
