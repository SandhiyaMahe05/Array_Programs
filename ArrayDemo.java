package program_arrays;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		ad.printArray();

		ad.printArray2();
		ad.printArray3();
		}
private void printArray3() {
		// TODO Auto-generated method stub
		int[] marks = { 93, 94, 95, 99, 99 };
		int total = 0;

		for (int i = 4; i >= 0; i--) {
			// if (marks[i] % 2 == 0)
			total = total + marks[i];
			// System.out.println(marks[i]);
		}
		System.out.println(total);
		System.out.println(total / 5 + "%");
	}

	private void printArray2() {
		// TODO Auto-generated method stub
		int[] marks = { 93, 94, 95, 99, 99 };

		for (int i = 4; i >= 0; i--)
		// for(int i =1;i<5;i+=2){
		{
			System.out.println(marks[i]);

		}
	}

	private void printArray() {
		// TODO Auto-generated method stub
		int[] marks = { 93, 94, 95, 99, 99 };

		for (int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
		}
	}
}