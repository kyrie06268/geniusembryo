package day04;

public class Ex02_MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(1,2);
		System.out.println(sum);
		System.out.println(sum(1,2));
	}
// Parameters: two integers, Return type: int.
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
}
