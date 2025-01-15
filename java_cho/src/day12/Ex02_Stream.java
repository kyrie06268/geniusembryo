package day12;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex02_Stream {

	public static void main(String[] args) {
		List<Person2> list = new ArrayList<Person2>();
		list.add(new Person2("Chocolate", 20, "M"));
		list.add(new Person2("Cookie", 20, "M"));
		list.add(new Person2("Custard", 10, "F"));
		list.add(new Person2("Cherry", 10, "M"));
		Stream<Person2> stream = list.stream();
		stream
			.filter(p->p.getGender().equals("M"))
			
			.forEach(p->System.out.println(p));
		list.stream().filter(p->p.getAge() < 20).filter(p->p.getGender().equals("F"))
		.forEach(p->System.out.println(p));
		long count = list.stream().filter(p->p.getGender().equals("F")).count();
		System.out.println(count);
		stream = list.stream();
		OptionalDouble av = stream.mapToInt(Person2::getAge).average();
		if(av.isPresent()) {
			System.out.println("Average age is : " + av);
			}
			else {
				System.out.println("N/A");
			}
		stream = list.stream();	
		double av2 = stream.mapToInt(Person2::getAge).average().orElse(0);
		stream = list.stream();	
		List<Person2> list2 = stream.filter(p ->p.getAge() > 10).collect(Collectors.toList());
		System.out.println(list2);
	
	}


	}


@Data
@AllArgsConstructor
class Person2{
	private String name;
	private int age;
	private String gender;
}