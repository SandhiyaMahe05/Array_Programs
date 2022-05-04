package program_arrays;

import java.util.Scanner;

public class MoveRight{
	public static void main(String[] args) {
		MoveRight mr = new MoveRight();
		mr.sortMoveRight();
    }
private void sortMoveRight() {
		// TODO Auto-generated method stub
		String[] frnds = { "Sandhiya", "swetha", "Ishu", "loga", "sandy" };
		for (int i = 0; i < frnds.length; i++) {
			System.out.print(frnds[i] + " ");
		}
		int len = frnds.length;
		String temp = frnds[len - 1];
		System.out.println();
		int i=1;
	    for (i = 1; i < len; i++) {
			frnds[len - i] = frnds[len - (i + 1)];
		}
		frnds[len - i] = temp;
		for (int i1 = 0; i1 < frnds.length; i1++) {
			System.out.print(frnds[i1] + " ");
		}
	}
  }
