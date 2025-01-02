import java.util.Scanner;

public class Ex10_ForInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for( ; ; ) {
			System.out.print("Enter a character : ");
			char c = scan.next().charAt(0);
			if(c == 'q') {
				System.out.println("Terminated.");
				break;}
		}
		
		

	}

}
