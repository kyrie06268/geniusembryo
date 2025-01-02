import java.util.Scanner;

public class Ex06_ForGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = 1;
		for(int i = 1 ; i <= Math.min(a, b) ; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		if(gcd == 1)
		System.out.println(a + " and " + b + " are relatively prime.");
		else
		System.out.println("The GCD for "+ a + " and " + b + " is " + gcd + ".");
		

	}

}
