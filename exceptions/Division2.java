package exceptions;

import java.util.Scanner;

public class Division2 {
	public static void main(String[] args) throws ArithmeticException {
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

		result=fitstNum/secondNum;
		System.out.println("Result : "+result);
	}

}