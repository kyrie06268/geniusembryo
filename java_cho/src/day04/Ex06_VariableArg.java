package day04;

public class Ex06_VariableArg {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

	}
public static int sum(int ... nums ) {
	int sum = 0;
	for(int num : nums) {
		sum+=num;
	}
	return sum;
}

}
