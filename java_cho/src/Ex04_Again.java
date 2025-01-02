import java.util.Scanner;

public class Ex04_Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a postive integer : ");
		int num = scan.nextInt();
	
		for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
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
