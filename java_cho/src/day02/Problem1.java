package day02;

public class Problem1 {

	public static void main(String[] args) {
		int[] lex = new int[] {1, 2, 3, 4, 5};
		int a;
		for(int i = 1; i < lex.length-1; i++) {
			if(lex[i+1] > lex[i]) {
				a = 0;
					}
			else{
				for(int j = 2; j < lex.length-1; j++) {
					if(lex[i+1] > lex[i]) {
						a = 1;
					}
						}
					else{
						a = 2;
					}
				}
			}

		if(a == 0) {
		for(int k = 0; k < lex.length; k++) {
			System.out.print(lex[k]);}
		}
		if(a == 1) {
			
		}
		if(a == 2) {
			
		}
		
	}
}
