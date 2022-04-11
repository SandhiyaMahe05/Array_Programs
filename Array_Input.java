package program_arrays;

import java.util.Scanner;

public class Array_Input {
	public static void main(String[] args) {
		Array_Input ad = new Array_Input();
		
		ad.arrayInput();

		ad.array00();
}
private void array00() {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		ar[0] = 90;
		ar[2] = 80;
	System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	private void arrayInput() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int count = sc.nextInt();//input strore
		int[] marks = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Enter the marks:");
			marks[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) {
			System.out.println(marks[i]);
		}
	}}