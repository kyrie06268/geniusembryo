import java.util.Scanner;

public class Ex04_ForDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int num = scan.nextInt();
		System.out.print("The divisors of " + num + " are : ");
		for(int i = 1; i <= num ; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
				
		}

	}

}
