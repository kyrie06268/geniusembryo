package day05;

public class Ex05_static2 {

	public static void main(String[] args) {
		System.out.println(sum1(1,2));
		Ex05_static2 s = new Ex05_static2();
		System.out.println(s.sum2(1,2));
		Homework1WithMethod.main(args);
	}
public static int sum1(int num1, int num2) {
	return num1 + num2;
	}
public int sum2(int num1, int num2) {
	return num1 + num2;
	}
}
class StaticTest{
	int a;
	static int sa;
	public void printA() {
		a=10;
		sa=10;
	}
	public static void printSa() {
		// a = 10;
		StaticTest st = new StaticTest();
		st.a = 10;
		sa = 10;
	}
	public void test() {
		printA();
		printSa();
	}
	public static void staticTest() {
		StaticTest st = new StaticTest();
		st.printA();
		printSa();
	}
}