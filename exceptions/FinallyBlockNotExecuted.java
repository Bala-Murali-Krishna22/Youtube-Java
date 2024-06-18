package exceptions;

public class FinallyBlockNotExecuted {
	public static void main(String[] args) {
		try {
			System.out.println("Try-block");
//			System.exit(0);
		}finally {
			System.out.println("Finally-block");
		}
	}
}
