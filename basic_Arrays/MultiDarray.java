package basic_Arrays;

public class MultiDarray {
	public static void main(String[] args) {
		//1st Approach 2D-array
		int[][] a= {{1,2},{3,4},{5,6}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//2nd Approach Jagged-array
		int[][] b=new int[2][];
		b[0]=new int[] {6,7,8};
		b[1]=new int[] {5,4};
		 for(int i=0; i<b.length; i++) {
			 for(int j=0; j<b[i].length; j++) {
				 System.out.printf(b[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //3rd Approach
		 int[][] c=new int[2][3];
		 c[0][0]=5;
		 c[0][1]=2;
		 c[0][2]=3;
		 c[1][0]=8;
		 c[1][1]=6;
		 c[1][2]=7;
		 for(int i=0; i<c.length; i++) {
			 for(int j=0; j<c[i].length; j++) {
				 System.out.printf(c[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //
	}
}
