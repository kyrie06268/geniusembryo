package day07;

import java.util.Scanner;

public class Ex05_StudentScore2 {

	public static void main(String[] args) {
		
			int input, count = 0;
			Scanner scan = new Scanner(System.in);
			Student list [] = new Student [10];
			
			
			do {
				System.out.println("Menu");
				System.out.println("1. Add score.");
				System.out.println("2. Access gradebook.");
				System.out.println("3. Change student score.");
				System.out.println("4. Delete student information.");
				System.out.println("5. Terminate.");
				System.out.print("Choose from menu : ");
				input = scan.nextInt();
				switch(input) {
				case 1: System.out.println("Add score");
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
					Student temp = new Student(name, yearGrade, classNum, studentNum, course, score);
					
					if(indexFinder(list, count, yearGrade, classNum, studentNum, course) >= 0) {
						System.out.println("Student record already exists. Enter new student.");
						}
					else {
						list[count] = temp; 
						count++;
					}
					break;
				case 2: System.out.println("Access grade");
				for(int i = 0; i < count; i++) {
					list[i].print();
				}
					break;
				case 3: System.out.println("Change a student's score");
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
					int index = indexFinder(list, count, yearGrade, classNum, studentNum, course);
					System.out.println(index);
					// if(index >= 0) {
					// list[index].setScore(score);}
					// else
					//	System.out.println("Invalid entry. Try again.");
					break;
				case 4:	System.out.println("Enter the student info that you want to delete.");
					System.out.print("Enter year : ");
					yearGrade = scan.nextInt();
					System.out.print("Enter class number: ");
					classNum = scan.nextInt();
					System.out.print("Enter student number: ");
					studentNum = scan.nextInt();
					System.out.print("Enter course : ");
					course = scan.next();
					score = scan.nextInt();
					index = indexFinder(list, count, yearGrade, classNum, studentNum, course);
					// Student [] list2 = new Student[count-1];
					// if(index != 0){
					// System.arraycopy(list, 0, list2, 0, index-1);
					// System.arraycopy(list, index+1, list2, index, count-index);}
					// else
					// System.arraycopy(list, 1, list2, 0, count-1);	
					// list = list2;
					if(index >= 0) {
						if(index != count - 1) {
						Student list2 [] = new Student [list.length];
						System.arraycopy(list, index + 1, list2, index, count-index-1);
						}
						count--;
					}
					//for(int i = index; i < count-1; i++) {
						//list[i] = list [i + 1];
					//}
					else
						System.out.println("Invalid entry. Try again.");
					break;
				case 5:	System.out.println("Teminated.");
					break;
				default:System.out.println("Incorrect input.");
				}
				
			}while(input != 5);
		}
	public static int indexFinder(Student [] list, int count, int yearGrade, int classNum, int studentNum, String course) {
			for(int j = 0; j < count; j++) {
			if(list[j].equal(yearGrade, classNum, studentNum, course)){
				return j;
				}
			}
		return -1;
	}	
	}



