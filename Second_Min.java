package program_arrays;

import java.util.Scanner;

public class Second_Min {
	public static void main(String[] args) {
		Second_Min smin = new Second_Min();
	 smin.sec_Min();
	}

	private void sec_Min() {
		// TODO Auto-generated method stub
		int[] marks = { 98, 99, 67, 85, 66 };
		int min = marks[0];
		int sec_min =100;
		int n;
		for (n = 1; n < marks.length; n++) {
			if (min > marks[n]) {
				sec_min = min;
				min = marks[n];
			} else if (marks[n] < sec_min) {
				sec_min = marks[n];
			}

		}
		System.out.println("Minumum mark is: " + min);
		System.out.println("Second minimum mark is: " + sec_min);

	}
}
