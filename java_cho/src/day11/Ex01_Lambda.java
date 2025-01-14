package day11;

public class Ex01_Lambda {

	public static void main(String[] args) {
		MyMathClass mc = new MyMathClass();
		System.out.println(mc.max(1, 2));
		MyMath mc2 = new MyMath() {
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		
		};
		System.out.println(mc2.max(1, 2));
		MyMath mc3 = (a, b) ->{
			return a > b ? a : b;
		};
		MyMath mc4 = (a, b) -> a > b ? a : b;
		System.out.println(mc4.max(1, 2));
		Abs abs = (n)->{
			return n < 0 ? -n : n;
		};
	}
}
interface Abs{
	int abs(int n);
}
interface MyMath{
	int max(int a, int b);
}
class MyMathClass implements MyMath{
	@Override
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	
}