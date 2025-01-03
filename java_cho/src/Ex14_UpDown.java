import java.util.Scanner;

public class Ex14_UpDown {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int r = (int)(1+100*(Math.random()));
		// System.out.println(r);
		int num = 0;
		while(num != r) {
		System.out.print("Enter a number between 1 and 100 : ");
			num = scan.nextInt();
		if(num > r)
			System.out.println("Down!");
		else if(num < r)
			System.out.println("Up!");
		else
			{
			System.out.println("Correct!");
			}
		}

	}

}
