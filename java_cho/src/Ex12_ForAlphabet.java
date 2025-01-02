
public class Ex12_ForAlphabet {

	public static void main(String[] args) {
	 char alphabet;
		for(int i = 0; i < 26; i++) {
			alphabet = (char)('a' + i);
			System.out.print(alphabet);
	 }
		System.out.println();
		for(char ch ='a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
