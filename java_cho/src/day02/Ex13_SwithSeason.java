package day02;

public class Ex13_SwithSeason {

	public static void main(String[] args) {
		int month = -1;
		switch(month){
		case 3, 4, 5 : System.out.println(month + "month is Spring.");
		break;
		case 6, 7, 8 : System.out.println(month + "month is Summer");
		break;
		case 9, 10, 11 : System.out.println(month + "month is Autumn");
		break;
		case 1, 2, 12 : System.out.println(month + "month is Winter");
		break;
		default: System.out.println("N/A");
		}
	}

}
