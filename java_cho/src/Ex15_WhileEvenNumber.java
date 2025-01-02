
public class Ex15_WhileEvenNumber {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				
			}
				i++;
		}
		System.out.println();
		i = 0;
		while(++i <= 10) {
			if(i % 2 == 1) {
				continue;
				
				
			}
			System.out.print(i + " ");
				
		}
	
	}

}

