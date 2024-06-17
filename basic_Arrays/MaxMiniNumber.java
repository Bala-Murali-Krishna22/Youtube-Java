package basic_Arrays;

import java.util.Arrays;

public class MaxMiniNumber {
	public static void main(String[] args) {
		int[] b=new MaxMiniNumber().createArray();
		new MaxMiniNumber().maxNumber(b);
		new MaxMiniNumber().miniNumber(b);
	}
	
	public int[] createArray() {
		int[] c= {3,2,5,1,4};
		System.out.println("Actual array : "+Arrays.toString(c));
		return c;
	}
	
	public void maxNumber(int[] b) {
		int max=b[0];
		for(int i=0; i<b.length; i++) {
			if(max<b[i]) {
				max=b[i];
			}
		}
		System.out.println("Maximum in an array : "+max);
	}
	
	public void miniNumber(int[] b) {
		int mini=b[0];
		for(int i=0; i<b.length; i++) {
			if(mini>b[i]) {
				mini=b[i];
			}
		}
		System.out.println("Minimum in an array : "+mini);
	}
	
}