
public class Ex04_Method2 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
			if(prime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for(int i = 1; i <= 100; i++) {
			System.out.print(prime(i)? i + " ":"");
		}
		
		System.out.println();
		System.out.print("10 is prime : " + prime(10));
		

	}
	public static boolean prime(int a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				count++;
			}
		}
	if(count == 2) {
		return true;
	}
	else 
		return false;
	}
	
	
}
