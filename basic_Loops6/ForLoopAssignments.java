package basic_Loops6;

import java.util.Scanner;

public class ForLoopAssignments {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ForLoopAssignments forLoopAssignments=new ForLoopAssignments();
		//
		System.out.println("Enter the starting number :");
		int num1=scanner.nextInt();
		System.out.println("Enter the ending number :");
		int num2=scanner.nextInt();
		//
		forLoopAssignments.print(num1, num2);
		evenNumbers(num1, num2);
		forLoopAssignments.divisibleBy7(num1, num2);
		primeNumbers(num1, num2);
		forLoopAssignments.sumOfEvenNumbers(num1, num2);
		scanner.close();
	}
	//
	public void print(int num1, int num2) {
		for(int i=num1; i<=num2; i++) {
			System.out.printf(i+" ");
		}
	}
	//
	public static void evenNumbers(int num1, int num2) {
		for(int i=num1; i<=num2; i++) {
			if(i%2==0)
				System.out.printf(i+" ");
		}
	}
	//
	public void divisibleBy7(int num1, int num2) {
		for(int i=num1; i<=num2; i++) {
			if(i%7==0)
				System.out.printf(i+" ");
		}
	}
	//
	public static void primeNumbers(int num1, int num2) {
		for(int i=num1; i<=num2; i++) {
			boolean isPrime=true;
			if(i>2) {
				int a=2;
				while(a<i) {
					if(i%a==0) {
						isPrime=false;
						break;
					}
					a++;
				}
			}else
				isPrime=false;
			if(isPrime)
				System.out.printf(i+" ");
		}
	}
	//
	public void sumOfEvenNumbers(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum of even numbers : "+sum);
	}
	//
}
