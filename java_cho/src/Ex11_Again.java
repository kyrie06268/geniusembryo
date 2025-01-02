import java.util.Scanner;

public class Ex11_Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i = 1; ;i++) {
		if((a*i) % b == 0) {
			System.out.println(a*i);
			break;
			}
				}
			}
	

	}


