package basic_Arrays_Sort;

import java.util.Arrays;

public class InsertionSort extends SortCreateArray implements SortInterface{

	@Override
	public void sorting(int[] b) {
		for(int i=0; i<b.length-1; i++) { //Iterations
			int j=i; int temp=b[j+1];
			while(j>=0 && b[j]>temp) {
				b[j+1]=b[j];
				j=j-1;
			}
			b[j+1]=temp;
		}
		System.out.println("Insertion sort :\nAfter sorting an array : "+Arrays.toString(b)+"\n");
	}
	
}