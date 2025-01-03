package day04.access.modifier1;

import day04.access.modifier2.B;

public class AccessModifier {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1.name = "홍길동";
		b1.name = "임꺽정";
		a1.address = "Seoul City";
		// a1.num = "123456-2513281";
		b1.setNum("123456-1234567");
		System.out.println(b1.getNum());
	}

}
