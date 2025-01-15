package day12;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex01_FunctionalInterface {
	public static void main(String[] args) {
	List<Person> list = new ArrayList<Person>();
	list.add(new Person("CottonCandy", "000101-1", 24));
	list.add(new Person("CheeseCake", "100101-2", 14));
	list.add(new Person("Chocolate", "110101-1", 13));
	list.add(new Person("CustardCream", "111111-1", 13));
	print(list, p->System.out.println(p.getName()));
	print(list, p->System.out.println(p));
	print(list, p->System.out.println(p.getNum()));
	Person p = randomNum(()->{
		int year = (int)(100*Math.random());
		DecimalFormat df = new DecimalFormat("00");
		String yearStr = df.format(year);
		int gender = (int)(4*Math.random()+1);
		String num = yearStr + "0101-" + gender;
		return new Person("", num, 0);
	});
	System.out.println(p);
	System.out.println("-----------------------------------------------------------");
	printString(list, p1->p1.getName());
	printString(list, p1->p1.getNum());

	replacePerson(list, p1 -> {
		p1.setAge(p1.getAge() + 1);
	return p1;
	});
	print(list, p1 -> System.out.println(p1));
	replacePerson(list, p1 -> {
		if(p1.getName().contains("Ch"))
		p1.setName("Co");
	return p1;
	});
	print(list, p1 -> System.out.println(p1));
	}
	public static void replacePerson(List<Person> list, UnaryOperator<Person> op) {
		for(int i = 0; i < list.size(); i++) {
			list.set(i, op.apply(list.get(i)));
		}
	}
	public static void printString(List<Person> list, Function<Person, String> f) {
		for(Person p : list) {
			System.out.println(f.apply(p));
		}
	}
	public static Person randomNum(Supplier<Person> p) {
		return p.get();
	}
	public static void print(List<Person> list, Consumer<Person>c) {
		for(Person p : list) {
			c.accept(p);
			
		}
	}
}
@Data
@AllArgsConstructor
class Person{
	private String name, num;
	private int age;
	public String getGender() {
		String gender = num.substring(7, 8);
		
		switch(gender) {
		case "1", "3": return "M";
		case "2", "4": return "F";
		default:
			throw new RuntimeException("N/A");
		
		}
	}
}