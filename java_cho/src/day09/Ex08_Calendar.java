package day09;

import java.util.Calendar;

public class Ex08_Calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR) + " year");
		System.out.println(c.get(Calendar.MONTH) + 1 + " month");
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " day");
		System.out.println(c.get(Calendar.HOUR_OF_DAY)  + " time");
		int date = Calendar.DAY_OF_WEEK;
		System.out.println(date);
		switch(date) {
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tueday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		
		
		}
		

	}

}
