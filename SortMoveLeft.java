package program_arrays;

import java.util.Scanner;

public class SortMoveLeft {
	public static void main(String[] args) {
		SortMoveLeft ad = new SortMoveLeft();
		ad.sortMoveLeft();
    }
    private void sortMoveLeft() {
		// TODO Auto-generated method stub
		
		String[] friends = { "Sandhiya", "swetha", "Ishu", "loga", "sandy" };
		for (int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
		String temp = friends[0];
		int i;
		for (i = 0; i < friends.length - 1; i++) {
			friends[i] = friends[i + 1];
		}
		friends[i] = temp;
		System.out.println();
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
    }
  }
