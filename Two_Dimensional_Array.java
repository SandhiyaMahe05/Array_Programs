package program_arrays;

import java.util.Scanner;

public class Two_Dimensional_Array {
	public static void main(String[] args) {
		Two_Dimensional_Array tda = new Two_Dimensional_Array();
		tda.two_DimensionalArray();
}

private void two_DimensionalArray() {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][5];
		Scanner sc = new Scanner(System.in);
		System.out.println(marks.length);// in 2 dimensional array the length is row length
		System.out.println(marks[0].length);// this shows the column length of array
		for (int row = 0; row < 3; row++) {
			int total = 0;
			for (int col = 0; col < 5; col++) {
				System.out.println("Enter the marks: ");
				marks[row][col] = sc.nextInt();
				total = total + marks[row][col];
			}
			System.out.println("Total is " + total);
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(marks[row][col] + " ");
			}
			System.out.println();
		}

	}
}
