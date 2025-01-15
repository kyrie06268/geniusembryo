package day12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex03_Student {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Student> list = new ArrayList<Student>();
public static void main(String[] args) {
	int op;
	do {
		printMenu();
		op = scan.nextInt();
		runMenu(op);
		
	}while(op != 3);
}
private static void runMenu(int op) {
	switch(op) {
	case 1:
		System.out.print("Enter student grade : ");
		int a = scan.nextInt();
		System.out.print("Enter student class number : ");
		int b = scan.nextInt();
		System.out.print("Enter student student number : ");
		int c = scan.nextInt();
		System.out.print("Enter student name : ");
		String d = scan.next();
		list.add(new Student(a, b, c, d));
		return;
	case 2:
		printMenu2();
		int m = scan.nextInt();
		runMenu2(m);
		return;
	default :
		System.out.println("Terminated.");
		return;
	}
	
	
}
private static void printMenu() {
	System.out.println("Menu");
	System.out.println("1. Add student.");
	System.out.println("2. Access student with filter.");
	System.out.println("3. Terminate.");
	System.out.print("Enter an option : ");
}
private static void runMenu2(int m) {
	Stream<Student> stream = list.stream();
	
	switch(m) {
	case 1:
		System.out.print("Enter a grade : ");
		int grade = scan.nextInt();
		list.stream().filter(s->s.getGrade() == grade).forEach(s->System.out.println(s));
		return;
	case 2:
		System.out.print("Enter a grade : ");
		int grade1 = scan.nextInt();
		System.out.print("Enter a class number : ");
		int classNum = scan.nextInt();
		list.stream().filter(s->s.getGrade() == grade1).filter(s->s.getClassNum() == classNum)
		.forEach(s->System.out.println(s));
		return;
	case 3:
		System.out.print("Enter a grade : ");
		int grade2 = scan.nextInt();
		System.out.print("Enter a class number : ");
		int classNum1 = scan.nextInt();
		System.out.print("Enter a student number : ");
		int num = scan.nextInt(); 
		list.stream().filter(s->s.getGrade() == grade2).filter(s->s.getClassNum() == classNum1)
		.filter(s->s.getNum() == num)
		.forEach(s->System.out.println(s));
		return;
	case 4:
		System.out.println(list);
		return;
	default:
	
	}
	
	
}
private static void printMenu2() {

	System.out.println("2-1. Access by grade : ");
	System.out.println("2-2. Access by class :");
	System.out.println("2-3. Access by student number : ");
	System.out.println("2-4. Full access : ");
	System.out.println("Enter an option : ");
	
	
}

}
@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
	@Override
	public String toString() {
		return grade + " year " + classNum + " class " + num + " number " + name; 
	}
	
}

