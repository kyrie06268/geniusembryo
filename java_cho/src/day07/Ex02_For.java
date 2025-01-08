package day07;

public class Ex02_For {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
			if(i == 10)
				System.out.println(sum);
		}
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				sum1 -= i;
			else
				sum1 += i;
		}
		System.out.println(sum1);
	}

}
