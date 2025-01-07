package day05;

import java.util.Scanner;

public class Ex08_Array {

	public static void main(String[] args) {
		int studentCount = 3;
		double av = 0;
		int sum = 0;
		int [] kor = new int[studentCount];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<studentCount;i++) {
			System.out.print("Student " + (i+1) + " Korean score : ");
			kor[i] = scan.nextInt();
				}
		System.out.println(kor[0] + ", " + kor[1] + ", " + kor[2]);
		for(int i=0;i<studentCount;i++) {
			
			sum += kor[i];
				}
		av = (double)sum/studentCount;
		
		System.out.print("Korean score average is : " + av);
		

	}

}
