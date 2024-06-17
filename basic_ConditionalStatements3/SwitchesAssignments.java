package basic_ConditionalStatements3;

import java.util.Scanner;

public class SwitchesAssignments {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SwitchesAssignments switchesAssignments=new SwitchesAssignments(); //Object creation
		evenOdd(scanner);
		switchesAssignments.arthimeticOperations(scanner);
		scanner.close();
	}
	//
	public static void evenOdd(Scanner scanner) {
		System.out.println("Input :");
		int num=scanner.nextInt();
		int remainder=num%2;
		switch(remainder) {
		case 0:
			System.out.println("It is EVEN number");
			break;
		case 1:
			System.out.println("It is ODD number");
			break;
		default:
			System.out.println("Invalid..!");
			break;
		}
	}
	//
	public void arthimeticOperations(Scanner scanner) {
		System.out.println("Enter first number :");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number :");
		int num2=scanner.nextInt();
		System.out.println("Enter the target operation :");
		String operation=scanner.next();
		int result=0;
		switch(operation) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			break;
		default:
			System.err.println("Invalid..!!");
			break;
		}
		System.out.println(result);
	}
}
