package day02;

public class Ex01_LogicalOperator {

	public static void main(String[] args) {
		
		int score = 80;
		boolean isB = score >= 80 && score < 90;
		System.out.println(score + "는 B입입니까?" + isB);
		int age = 15;
		boolean isAdult = age >= 18;
		System.out.println(age + "살은 성인입니까?" + isAdult);
		System.out.println(age + "살은 미성년자입니까?" + !isAdult);
		int num = 10;
		boolean isnonnegative = num > 0 || num == 0;
		System.out.println(num + "는 0 이상인가" + isnonnegative);

	}

}
