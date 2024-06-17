package basic_Methods1;

public class ReturnMultipleValues {
	public static void main(String[] args) {
		ReturnMultipleValues rmv=new ReturnMultipleValues();
		int ans[]=rmv.calculator(99, 22);
		System.out.printf("Add : %d%nSubtract : %d%nMulti : %d%nDivision : %d",
				ans[0], ans[1], ans[2], ans[3]);
	}
	
	public int[] calculator(int a, int b) {
		int add=a+b;
		int sub=a-b;
		int multi=a*b;
		int div=a%b;
		
		int ans[]=new int[4];
		
		ans[0]=add;
		ans[1]=sub;
		ans[2]=multi;
		ans[3]=div;
		
		return ans;
	}
	//
}
