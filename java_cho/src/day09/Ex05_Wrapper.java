package day09;

import java.util.ArrayList;

public class Ex05_Wrapper {

	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = n1;
		int n3 = n2;
		System.out.println(n2 + "," + n3);
		n2 = null;
		//n3 = n2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);

	}

}
