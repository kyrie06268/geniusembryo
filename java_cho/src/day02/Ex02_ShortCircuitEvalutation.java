package day02;

public class Ex02_ShortCircuitEvalutation {

	public static void main(String[] args) {
		int num1 = -10, num2 = 20;
		boolean result = num1 < 0 && (num2 = 10) <0;
		System.out.println("Result is :" + result);
		System.out.println("num1 :" + num1 + ", num2 :" + num2);

	}

}
