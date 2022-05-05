package program_arrays;

import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		Bubble_Sort bs = new Bubble_Sort();
		 bs.bubble_Sort();
  }
  private void bubble_Sort() {
		// TODO Auto-generated method stub
		int[] ar = { 5, 8, 11, 15 };
		int temp = 0;
		for (int j = 1; j < ar.length; j++) {

			for (int i = 0; i < ar.length - j; i++) {
				if (ar[i] < ar[i + 1]) {
					temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
		}
		System.out.println("Descending order of given array is: ");
		for (int i = 0; i < ar.length; i++)

		{
			System.out.print(ar[i] + " ");
		}
	}

}
