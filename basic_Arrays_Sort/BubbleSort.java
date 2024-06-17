package basic_Arrays_Sort;

import java.util.Arrays;

public class BubbleSort extends SortCreateArray implements SortInterface{
	
	@Override
	public void sorting(int[] b) {
		for(int i=0; i<b.length-1; i++) {
			for(int j=0; j<b.length-1; j++) {
				if(b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble-sort :\nArray aftyer sorting : "+Arrays.toString(b)+"\n");
	}
	
}