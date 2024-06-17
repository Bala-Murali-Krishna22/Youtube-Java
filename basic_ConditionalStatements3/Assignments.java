package basic_ConditionalStatements3;

import java.util.Scanner;

public class Assignments {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Assignments assignments=new Assignments();
		//
		evenOdd(scanner);
		assignments.studentResult(scanner);
	}
	//
	public static void evenOdd(Scanner scanner) {
		System.out.println("Enter the number :");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println(num+" is an EVEN number");
		}else {
			System.out.println(num+" is a ODD number");
		}
	}
	//
	public void studentResult(Scanner scanner) {
		System.out.println("Enter the marks :");
		int marks=scanner.nextInt();
		if(marks<35) {
			System.out.println("Result is : FAIL");
		}else if(marks==35) {
			System.out.println("Result is : PASS");
		}else if(marks>35 && marks<70) {
			System.out.println("Result is : THIRD class");
		}else if(marks>70 && marks<85) {
			System.out.println("Result is : SECOND class");
		}else if(marks>85 && marks<=100) {
			System.out.println("Result is : FIRST class");
		}else {
			System.out.println("Invalid !!");
		}
	}
	//
}
