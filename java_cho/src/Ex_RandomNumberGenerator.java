import java.util.Random;

public class Ex_RandomNumberGenerator {

	public static void main(String[] args) {
		int min = 1, max = 7;
		int r = (int)(1+7*(Math.random()));
		System.out.println(r);
		Random r1 = new Random();
		r = r1.nextInt(7)+1;
		System.out.println(r);
	}


}
