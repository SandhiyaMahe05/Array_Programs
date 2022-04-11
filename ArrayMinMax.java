package program_arrays;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		ArrayMinMax ad = new ArrayMinMax();
    ad.min_And_Max();
    }
private void min_And_Max() {
		// TODO Auto-generated method stub
		int []marks= {93,94,95,99,99};
		int max = 0;
		int j;
		for (j = 0; j < marks.length; j++) {
			if (marks[j] > max) {
				max = marks[j];
			}
		}

		System.out.println("Maximum mark is: " + max);

		int min = marks[0];
		int n;
		for (n = 0; n < marks.length; n++) {
			if (min > marks[n]) {
				min = marks[n];
			}

		}
		System.out.println("Minumum mark is: " + min);
		}
    }