package program_arrays;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		Linear_Search ls = new Linear_Search();
		ls.linearSearch();
    }
    private void linearSearch() { // TODO Auto-generated method stub //not suitable for large set of date
		String name = "sandhiya";
		String[] names = { "Sandeep", "yuvarani", "Selva", "Kurinji", "sandhiya" };
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + " is present in " + i + "th position");
				break;
			}
		}
	}
}
