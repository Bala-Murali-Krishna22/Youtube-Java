package basic_Loops6;

public class WhileLoops {
	public static void main(String[] args) {
		int i=5;
		int j=7;
		
		while (i<10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		//
		do {
			System.out.print(j+" ");
			j--;
		} while (j>0);
	}
}
