package day09;

import java.util.regex.Pattern;

public class Ex03_Regex {

	public static void main(String[] args) {
		String str = "00123123";
		String regex = "^\\d+$";
		if(Pattern.matches(regex, str)) {
			System.out.println(str + " is composed of digits only.");
		}
		else {
			System.out.println(str + " is not composed of digits only.");
		}
		
	}

}
