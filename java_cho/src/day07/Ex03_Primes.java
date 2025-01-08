package day07;

import java.util.Arrays;

public class Ex03_Primes {

	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
				count++;
		}
		if(count == 2)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		System.out.println(isPrime(2));
		boolean primeArray [] = new boolean [101];
		for(int j = 1; j < 101; j++) {
			primeArray[j] = isPrime(j);
		}
		System.out.println(Arrays.toString(primeArray));
		printArray(primeArray);
	}

public static boolean isPrime(int num) {
	boolean isPrime = false;
	int c = 0;
	for(int i = 1; i <= num; i++) {
		if(num % i == 0)
			c++;
	}
	if(c == 2) {
		isPrime = true;}
	return isPrime;
}
public static void printArray(boolean arr[]) {
	for(int m = 1; m < 101; m++) {
		if(arr[m])
			System.out.print(m + " ");}
}
}
