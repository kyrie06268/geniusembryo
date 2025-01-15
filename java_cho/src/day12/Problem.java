package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the dimension : ");
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		int[]b = new int[n*n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <n; j++) {
			a[i][j] = (i+1)*(j+1);
			b[i*n+j]=a[i][j];
			}
		}
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.print("Enter the index of B : ");
		int m = scan.nextInt();
		System.out.println(b[m-1]);
		
	}

}
