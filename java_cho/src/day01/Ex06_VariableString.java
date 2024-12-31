package day01;

public class Ex06_VariableString {

	public static void main(String[] args) {
		String str1 = "Hello world!";
		String str2 = "";
		String str3 = "A";
		String str4 = null;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		char ch1 = '1';
		char operator = '+';
		char ch2 = '2';
		System.out.println(ch1 + operator + ch2 + "");
		System.out.println("" + ch1 + operator + ch2);
		
		/*12345 31245
		  12354 245631(다음 수를 위해서는 뒤에 3자리만 보면 됨 내림이면 자리 바꾸고 내림, 아니면 쉬움) 246135
		  12435 246153
		  12453 246351
		  12534
		  12543
		  13245
		  */
		

	}

}
