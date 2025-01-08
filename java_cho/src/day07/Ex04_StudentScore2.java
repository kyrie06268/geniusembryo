package day07;

import java.util.Scanner;

public class Ex04_StudentScore2 {

	public static void main(String[] args) {
		
			int input, count = 0;
			Scanner scan = new Scanner(System.in);
			Student list [] = new Student [10];
			
			
			do {
				System.out.println("Menu");
				System.out.println("1. Add score.");
				System.out.println("2. Access gradebook.");
				System.out.println("3. Change student score.");
				System.out.println("4. Terminate.");
				System.out.print("Choose from menu : ");
				input = scan.nextInt();
				switch(input) {
				case 1: System.out.println("Add score : ");
					System.out.print("Enter year : ");
					int yearGrade = scan.nextInt();
					System.out.print("Enter class number: ");
					int classNum = scan.nextInt();
					System.out.print("Enter student number: ");
					int studentNum = scan.nextInt();
					System.out.print("Enter student name : ");
					String name = scan.next();
					System.out.print("Enter course : ");
					String course = scan.next();
					System.out.print("Enter student score: ");
					int score = scan.nextInt();
					list[count] = new Student(name, yearGrade, classNum, studentNum, course, score);
					count++;
					break;
				case 2: System.out.println("Access grade : ");
				for(int i = 0; i < count; i++) {
					list[i].print();
				}
					break;
				case 3: System.out.println("Change a student's score : ");
					System.out.print("Enter year : ");
					yearGrade = scan.nextInt();
					System.out.print("Enter class number: ");
					classNum = scan.nextInt();
					System.out.print("Enter student number: ");
					studentNum = scan.nextInt();
					System.out.print("Enter course : ");
					course = scan.next();
					System.out.print("Enter student score: ");
					score = scan.nextInt();
					int index = -1;
					for(int j = 0; j < count; j++) {
						if(list[j].equal(yearGrade, classNum, studentNum, course)){
							index = j;
							break;
							}
						}
					if(index >= 0) {
					list[index].setScore(score);}
					else
						System.out.println("Invalid input.");
					break;
				case 4:	System.out.println("Teminated.");
				default:System.out.println("Incorrect input.");
				}
				
			}while(input != 4);
		}
		
	}


class Student{
	String name, course;
	int yearGrade, classNum, studentNum, score;
	
	public Student(String name, int yearGrade, int classNum, int studentNum, String course, int score) {
		this.name = name;
		this.yearGrade = yearGrade;
		this.classNum = classNum;
		this.studentNum = studentNum;
		this.course = course;
		this.score = score;
		
	}
	public boolean equal(int yearGrade, int classNum, int studentNum, String course) {
		if(this.yearGrade != yearGrade) {
			return false;}
		if(this.classNum != classNum) {
			return false;}
		if(this.studentNum != studentNum) {
			return false;}
		if(this.course.equals(course)) {
			return false;}
		return true;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	public void print() {
		System.out.println("Year" + yearGrade + " " + classNum +" class " + studentNum + " num " + name +" " +course+" : " + score);
	}
}
