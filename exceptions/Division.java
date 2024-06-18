package exceptions;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		div(scanner);
		scanner.close();
	}

	static int fitstNum;
	static int secondNum;

	public static void div(Scanner scanner) {
		System.out.println("Enter first and second number : ");
		fitstNum=scanner.nextInt();
		secondNum=scanner.nextInt();

		int result = 0;

		try {
			result=fitstNum/secondNum;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			throw ae;
		}
		finally {
			System.out.println("'Finally block' - Result : "+result);
		}
	}

}