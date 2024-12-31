package day01;

public class Ex03_ConditionalOperator {

	public static void main(String[] args) {
		int num = 3;
		boolean isEven = num % 2 == 0;
		System.out.println(num + "는 짝수인가?" + isEven);
		String result = num % 2 ==0 ? "짝수이다" : "홀수"; 
		System.out.println(num + "은/는 " + result);
		

	}

}
