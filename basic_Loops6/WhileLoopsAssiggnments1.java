package basic_Loops6;

import java.util.Scanner;

public class WhileLoopsAssiggnments1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		WhileLoopsAssiggnments1 loopsAssiggnments1=new WhileLoopsAssiggnments1();
		//
		System.out.println("Enter starting number :");
		int num1=scanner.nextInt();
		System.out.println("Enter ending number :");
		int num2=scanner.nextInt();
		//
		print(num1, num2);
		loopsAssiggnments1.evenNumbers(num1, num2);
		divisibleBy7(num1, num2);
		loopsAssiggnments1.primeNumbers(num1, num2);
		loopsAssiggnments1.primeNumbers(num1, num2);
		sumOfEvenNumbers(num1, num2);
		scanner.close();
	}
	//
	public static void print(int num1, int num2) {
		while (num1<=num2) {
			System.out.print(num1+" ");
			num1++;
		}
	}
	//
	public void evenNumbers(int num1, int num2) {
		do {
			if(num1%2==0)
				System.out.print(num1+" ");
			num1++;
		} while (num1<=num2);
	}
	//
	public static void divisibleBy7(int num1, int num2) {
		while(num1<num2) {
			if(num1%7==0)
				System.out.print(num1+" ");
			num1++;
		}
	}
	//
	public void primeNumbers(int num1, int num2) {
		while (num1<=num2) {
			boolean isPrime=true;
			if(num1>2) {
				int i=2;
				while(i<num1) {
					if(num1%i==0) {
						isPrime=false;
						break;
					}
					i++;
				}
			}else {
				isPrime=false;
			}
			if(isPrime) {
				System.out.print(num1+" ");
			}
			num1++;
		}
	}
	//
	public static void sumOfEvenNumbers(int num1, int num2) {
		int sum=0;
		
		do {
			if(num1%2==0) {
				sum+=num1;
			}
			num1++;
		} while (num1<=num2);
		System.out.println("Sum of even numbers : "+sum);
	}
}
