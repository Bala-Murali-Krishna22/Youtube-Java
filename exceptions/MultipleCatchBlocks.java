package exceptions;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		int[] a= {0,1,2,3};
//		int div=0;
		int values=0;
		
		try {
//			div=a[2]/a[0];
			values=a[5];
		}catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			throw ae;
		}catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println(abe.toString());
			throw abe;
		}finally {
//			System.out.println(div);
			System.out.println(values);
		}
	}
}