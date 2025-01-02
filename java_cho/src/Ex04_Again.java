import java.util.Scanner;

public class Ex04_Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a postive integer : ");
		int num = scan.nextInt();
		if(num == 2)
			System.out.println(num + " is prime.");
		else {
		for(int i = 2 ; i <= num ; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime.");
				break;
			}
			else {System.out.println(num + " is prime.");
			break;	
			}
		}
		}	
		
		
		
	}

}
