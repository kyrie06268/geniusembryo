package day04;

public class Ex05_Method_TimesTable {

	public static void main(String[] args) {
		/* for(int i = 2; i < 10 ; i++) {
			for(int j = 1 ; j < 11; j++) {
				System.out.println(i + " X " + j + "=" + i*j);
			}
			System.out.println("--------");
		}*/ 
	for(int i = 2; i < 10; i++) {
		printTimesTable(i);
		System.out.println();
		}
	}
	public static void printTimesTable(int i) {
		for(int j = 1 ; j < 11; j++) {
			System.out.println(i + " X " + j + "=" + i*j);
		}
	}
}
