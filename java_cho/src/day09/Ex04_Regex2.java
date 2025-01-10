package day09;

import java.util.regex.Pattern;

public class Ex04_Regex2 {

	public static void main(String[] args) {
		String id = "abc123";
		String regex = "^[a-zA-Z0-9!@#$]{8, 13}$";
		// String regex = "^(\\w|[!@#$]){8, 13}$";
		System.out.println(id + " is an invalid entry.");
		if(Pattern.matches(regex, id)) {
			System.out.println(id + " is composed of digits only.");
		}
		else {
			System.out.println(id + " is not composed of digits only.");
		}
		
		

	}

}
