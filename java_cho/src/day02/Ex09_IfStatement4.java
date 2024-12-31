package day02;

public class Ex09_IfStatement4 {

	public static void main(String[] args) {
		int month = 10;
		if(month > 12 || month < 1) {
			System.out.println("Invalid month.");
		}
		else if(month == 3 || month == 4 || month == 5) {
			System.out.println("The season for " + month + "month is Spring.");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("The season for " + month + "month is Summer.");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println("The season for " + month + "month is Autumn.");
}
		else{
			System.out.println("The season for " + month + "month is Winter.");
}

	}

}
