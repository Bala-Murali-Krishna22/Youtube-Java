package basic_Arrays_Sort;

import java.util.Arrays;

public class SelectionSort extends SortCreateArray implements SortInterface{

	@Override
	public void sorting(int[] b) {

		for(int i=0; i<b.length; i++) {
			int temp1=b[i];
			for(int j=i+1; j<b.length; j++) {
				if(i>j) {
					b[i]=b[j];
					b[j]=temp1;
				}
				temp1=i;
				//			while(int j>=0 && b[i]>b[j]) {
				//				i=j;
				//				j=temp1;
				//				j++;
				//			}
			}
		}
		System.out.println("Selection-sort :\nArray after sorting : "+Arrays.toString(b)+"\n");
	}
}

//mini=b[i];
//if(mini>b[j]) {
//	temp=mini;
//	mini=b[j];
//}