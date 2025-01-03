
public class Ex00Isosceles {

	public static void main(String[] args) {
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 3-i; j >=1 ; j--) {
				System.out.print(" ");
		
			}
			for(int k = 1; k <= 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l = 0; l < 3 ; l++) {
			for(int k = 0; k <= l; k++) {
				System.out.print(" ");
		
			}
			for(int m = 5-2*l; m >= 1; m--) {
				System.out.print("*");
			}
			System.out.println();	
		}

	}

}
