import java.util.Scanner;

public class Ex11_ForLCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count = 1;
		for(int i = 1; ; i++, count++) {
			if(i % a ==0 && i % b == 0) {
				System.out.println(i + ", " + count);
				break;
			}
		}
		count = 1;
		for(int j = a; ;j +=a, count++) {
			if(j % b == 0) {
				System.out.println(j + ", " + count);
				break;
			}
		}
		
	}

}
