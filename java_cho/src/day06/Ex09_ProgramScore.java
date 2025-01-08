package day06;

import java.util.Scanner;

public class Ex09_ProgramScore {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student [] std = new Student[5];
		char menu;
		int count = 0;
		do {
			
			printMenu();
			
			
			menu = scan.next().charAt(0);
			
			
			count = runMenu(menu, std, count);
			
			std = expend(std, count);
		}while(menu != '3');
	}

	
	private static void printMenu() {
		System.out.println("-----------메뉴-----------");
		System.out.println("1. 학생 국어 성적 추가");
		System.out.println("2. 학생 국어 성적 전체 조회");
		System.out.println("3. 종료");
		System.out.println("-------------------------");
		System.out.print("메뉴 선택 : ");
	}

	private static int runMenu(char menu, Student[] std, int count) {
		System.out.println("-------------------------");
		switch(menu) {
		case '1':
			count = insertStudent(std, count);
			break;
		case '2':
			printStudent(std, count);
			break;
		case '3':
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		System.out.println("-------------------------");
		return count;
	}
	
	private static int insertStudent(Student[] std, int count) {
		System.out.println("이름 : ");
		String name = scan.nextLine();
		
		return count+1;
	}


	private static void printStudent(Student[] std, int count) {
		
		for(int i = 0; i<count; i++) {
			
			
		}
		
	}


	private static Student[] expend(Student[] std, int count) {
		if(std == null) {
			return new Student[5];
		}
		if(count < std.length) {
			return std;
		}
		//확장
		Student tmp[] = new Student[std.length + 5];
		//복사 
		System.arraycopy(std, 0, tmp, 0, std.length);
		
		return tmp;
	}

}

class Student{
	private String name;
	private int score;
}