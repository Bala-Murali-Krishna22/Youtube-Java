package basic_Arrays_Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortCreateArray {

	public int[] createArray(Scanner scanner, Random random) { 
		System.out.println("Enter the length of an array : ");
		
		int n=scanner.nextInt();
		int[] c=new int[n]; //int[] c= {9,7,5,8,6};

		for(int i=0; i<n; i++) {
			c[i]=random.nextInt(10);
		}
		System.out.println("\nArray before sorting : "+Arrays.toString(c)+"\n");
		return c;
//		scanner.close();
	}
}