package day09;

import java.util.Random;

public class Ex06_Random {

	public static void main(String[] args) {
		Random random = new Random(1);
		int min = 1, max = 10;
		
		for(int i = 0; i < 10; i++) {
			int r = random.nextInt(10) + min;
			System.out.println(r);
		}
		

	}

}
