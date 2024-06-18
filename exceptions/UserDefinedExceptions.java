package exceptions;

@SuppressWarnings("serial")
public class UserDefinedExceptions extends Exception{
	
	public UserDefinedExceptions(String message) {
		super(message);
	}
	
	public static void main(String[] args) throws Exception {
		int result=0;
		try {
			result=5/0;
		}catch(ArithmeticException ae) {
			throw new UserDefinedExceptions("Dont divide  with 'zero-0'");
		}finally {
			System.out.println(result);
		}
	}
	
}