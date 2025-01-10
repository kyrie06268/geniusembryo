package day09;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Ex09_Format {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("###,###");
		int num = 123456789;
		System.out.println(format.format(num));
		MessageFormat m = new MessageFormat("");
		
		

	}

}
