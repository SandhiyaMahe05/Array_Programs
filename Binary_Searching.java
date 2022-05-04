package program_arrays;

import java.util.Scanner;

public class Binary_Searching {
	public static void main(String[] args) {
		Binary_Searching bs = new Binary_Searching();
		bs.searching();
	}
private void searching() {
		// TODO Auto-generated method stub
		int[]ar= {10,20,30,35,42,57,68,78,79};
		int key = 57;
		int min = 0,max=ar.length-1;
		while(min<=max)
		{
			int mid = (min+max)/2;
			if(key==ar[mid])
			{
				System.out.println( "key is present at "+mid);
				break;
			}
			else if(key<ar[mid])
			{
				max = mid-1;
			}
			else if(key>ar[mid])
			{
				min=mid+1;
			}
		}
		if(min>max)
		{
		System.out.println("key is not present");	
		}
		
	   }
}
