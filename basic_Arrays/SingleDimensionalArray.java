package basic_Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
//		int[] a= {1,2,3,4,5};
		int[] b=new int[4];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		for(int i=0; i<b.length; i++) {
			System.out.printf(b[i]+" ");
		}
		System.out.println();
		//
		String[] s= {"abc", "def", "ghi", "jkl", "mno"};
		for(int j=0; j<s.length; j++) {
			System.out.printf(s[j]+" ");
		}
		System.out.println();
		//
		boolean[] c= {true, false, true, false};
		for(int k=0; k<c.length; k++) {
			System.out.printf(c[k]+" ");
		}
		//
	}
}
