package program_arrays;

import java.util.Scanner;

public class Second_Max {
	public static void main(String[] args) {
		Second_Max sm = new Second_Max();
		sm.sec_Max();
	}
private void sec_Max() {
		// TODO Auto-generated method stub
		int[] marks = { 99, 95, 98, 97, 94 };
		int max = 0;
		int sec_Max = 0;
		int i;
		for (i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				sec_Max = max;
				max = marks[i];
			} else if (marks[i] > sec_Max&&marks[i]!=max)
			{
				sec_Max = marks[i];
			}
		}
		System.out.println("Maximum mark is: "+max);
		System.out.println("Second Maximum mark is: "+sec_Max);

	}
	}
