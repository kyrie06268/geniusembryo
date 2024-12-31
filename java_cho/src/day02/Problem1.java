package day02;

public class Problem1 {

	public static void main(String[] args) {
		int[] lex = new int[] {1, 2, 3, 4, 5};
		for(int i = 0; i < lex.length; i++) {
			System.out.println(lex[i]);
		}
		for(int i = 1; i < lex.length; i++) {
			if(lex[i+1] > lex[i]) {
				for(int j = 0; j < lex.length; j++) {
				System.out.println(lex[i]);
				}
			}
			
		}
		
	}
}
