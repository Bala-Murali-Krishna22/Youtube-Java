package basic_Arrays_Sort;

import java.util.Random;
import java.util.Scanner;

public class SortMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		int[] b=new SortCreateArray().createArray(scanner, random);
		
		SortInterface bubbleSort=new BubbleSort();
//		bubbleSort.sorting(b);
		
		SortInterface selectionSort=new SelectionSort();
//		selectionSort.sorting(b);
		
		SortInterface insertionSort=new InsertionSort();
		insertionSort.sorting(b);
		
		scanner.close();
	}
}