
public class Ex07_ForSum {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			sum +=i;
		}
		System.out.println(sum);
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 == 1)
				continue;
			sum1 +=i;
		}
		System.out.println(sum1);
	}

}
