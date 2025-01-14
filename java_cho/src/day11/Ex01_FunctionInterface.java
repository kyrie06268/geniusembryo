package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex01_FunctionInterface {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("CottonCandy", "000101-1"));
		list.add(new Person("CheeseCake", "100101-2"));
		list.add(new Person("Chocolate", "110101-1"));
		list.add(new Person("CustardCream", "111111-1"));
		print1(list, p->p.getName().contains("Ch"));
		print1(list, p->p.getGender().equals("F"));
		print1(list, p->Integer.parseInt(p.getNum().substring(2, 4)) == 1);
	}
public static void print1(List<Person> list, Predicate<Person> p) {
	for(Person person:list){
		if(p.test(person)) {
			System.out.println(person);
		}
	}
}
}
@Data
@AllArgsConstructor
class Person{
	private String name, num;
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