package exceptions;

public class MultipleExceptionsInSingleBlock {
	public static void main(String[] args) {
		int[] a= {0,1,2,3};
		int div=0;
//		int values=0;
		
		try {
			div=a[2]/a[0];
//			values=a[5];
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.toString());
			throw ae;
		}finally {
			System.out.println(div);
//			System.out.println(values);
		}
	}
}