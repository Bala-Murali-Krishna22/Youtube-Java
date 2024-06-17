package basic_UserInput2;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//
		System.out.println("Hi, What is your name ?");
		String name=scanner.nextLine();
		System.out.printf("Hey %s, How are you? \n", name);
		String status=scanner.nextLine();
		System.out.println("What is your age ?");
		int age=scanner.nextInt();
		System.out.printf("You are %s, Your age is %d%n", status, age);
		System.out.println("Thanks for information !!");
		scanner.close();
	}
}