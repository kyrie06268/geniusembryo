package day02;

import java.util.Scanner;

public class Ex14_SwitchStatment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two integers and an operator : ");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch(op){
		case '+': System.out.println(num1+num2);
		break;
		case '-': System.out.println(num1-num2);
		break;
		case '*': System.out.println(num1*num2);
		break;
		case '/': System.out.println((double)num1/num2);
		break;
		case '%': System.out.println(num1%num2);
		break;
		default: System.out.println("N/A");
		}
	}

}
