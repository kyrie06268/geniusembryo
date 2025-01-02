
public class Ex03_ForEvenNumber {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1)
			continue;
		System.out.print(i + " ");
		}
		System.out.println();
		for(int j = 2; j<= 10; j+=2) {
			System.out.print(j + " ");
				}
		System.out.println();
		for(int k =1; k <= 5; k++) {
		System.out.print(2*k + " ");
			}
		
	}

}
