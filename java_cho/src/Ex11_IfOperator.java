import java.util.Scanner;

public class Ex11_IfOperator {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter two integers and an operator( Ex. 1 + 2 ) : ");
	int num1 = scan.nextInt();
	char op = scan.next().charAt(0);
	int num2 = scan.nextInt();
	System.out.println("" + num1 + op + num2 + "=");
    if (op == '+') {
		System.out.println(num1 + num2);
	}
    else if (op == '-') {
    	System.out.println(num1 - num2);
    }
    else if (op == '*') {
    	System.out.println(num1 * num2);
    }
    else if (op == '/') {
    	System.out.println((double)num1 / num2);
    }
    else if (op == '%') {
    	System.out.println(num1 % num2);
    }
    else {
    	System.out.println(op + "is a wrong operator");
    }
	}
	

}
