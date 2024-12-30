package day01;

public class Ex05_VariableBoolean {

	public static void main(String[] args) {
		boolean isAdult = true;
		int age = 20;
		isAdult = age > 18;
		System.out.println(age + "살은 성인?" + isAdult);
		int age1 = 10;
		isAdult = age1 > 18;
		System.out.println(age1 + "살은 성인?" + isAdult);
	}

}
