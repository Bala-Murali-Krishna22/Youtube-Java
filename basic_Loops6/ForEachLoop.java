package basic_Loops6;

public class ForEachLoop {
	public static void main(String[] args) {
		System.out.println("Single dimensional array FOR for each loop :");
		int[] a= {1,2,3,4,5,6,};
		
		//Normal for loop
		System.out.println("Normal for loop :");
		for(int i=0; i<a.length; i++) {
			System.out.printf(a[i]+" ");
		}
		System.out.println();
		
		//Extended for loop (OR) for each loop
		System.out.println("Extended for loop (OR) for each loop :");
		for(int value:a) {
			System.out.printf(value+" ");
		}
		System.out.println();
		
		// *** //
		
		System.out.println("Multi dimensional array FOR for each loop :");
		int[][] b= {{9,8},{7,6},{5,4}};
		
		//Normal for loop
		System.out.println("Normal for loop :");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Extended for loop (OR) for each loop
		System.out.println("Extended for loop (OR) for each loop :");
		for(int[] row:b) {
			for(int value:row) {
				System.out.printf(value+" ");
			}
			System.out.println();
		}
	}
}
