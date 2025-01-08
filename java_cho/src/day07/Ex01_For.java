package day07;

public class Ex01_For {

	public static void main(String[] args) {
		int max = 16;
		for(int j = 0; j <4; j++) {
		for(int i = 1; i < 5; i++ ) {
			System.out.print(i+ 4*j + " ");
		}
				System.out.println();
		}
		for(int i = 1; i <= max; i++ ) {
			System.out.print(i+" ");
			if(i % 4 == 0)
				System.out.println();
		}
	}

}
