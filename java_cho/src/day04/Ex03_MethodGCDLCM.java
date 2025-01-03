package day04;

import java.util.Scanner;

public class Ex03_MethodGCDLCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = gcd(a, b);
		System.out.println(gcd);
		int lcm = lcm(a, b);
		System.out.println(lcm);
		System.out.println(lcm1(a, b));
		System.out.println(randomNumberGenerator(a, b));
	}
	public static int gcd(int a, int b) {
		int gcd = 1;
		for(int i = 1 ; i <= Math.min(a, b) ; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	public static int lcm(int a, int b) {
		
		for(int j = a; ;j +=a) {
			if(j % b == 0) {
				return j;
			}
		}
		
	}
	public static int lcm1(int a, int b) {
		return a*b/gcd(a,b);
	}
	public static int randomNumberGenerator (int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		return min + (int)((max - min + 1)*(Math.random()));
	
	}
}
