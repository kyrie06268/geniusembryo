package day01;

public class Ex03_VariableNumber {

	public static void main(String[] args) {
		byte num1 = 1;
		//num1 = 12345;
		System.out.println(num1);
		int num2 = 123456789;
		//num2 = 123456789012;
		System.out.println(num2);
		long num3 = 123456789012L;
		System.out.println(num3);
		
		float num4 = 3.14F;
		System.out.printf("%.9f\n", num4);
		double num5 = 3.14;
		System.out.println(num5);
		System.out.printf("%.20f\n", num5);
		int num6 = 0x10;// base 16
		System.out.println(num6);
		int num7 = 010;// base 8
		System.out.println(num7);
		int num8 = 0b10;// base 2
		System.out.println(num8);
		int num9 = 'A'; // the number corresponding to 'A'
		System.out.println(num9);
		double num10 = 1e3; // 
		System.out.println(num10);
		
		
		

	}

}
