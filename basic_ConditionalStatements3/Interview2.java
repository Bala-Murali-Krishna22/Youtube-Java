package basic_ConditionalStatements3;

import java.util.Scanner;

public class Interview2 {
	public static void main(String[] args) {
		Interview2 interview2=new Interview2();
		Scanner scanner=new Scanner(System.in);
		/***/
		generalRound(scanner, interview2);
		scanner.close();
	}
	// Global variables
	static String result1="Pass";
	static String selected="You are selected, wait for next round";
	static String notSelected="We are regretting, you can go home :(";
	//
	static void generalRound(Scanner scanner, Interview2 interview2) {
		System.out.print("Enter your result : ");
		String result2=scanner.next();
		if(result1.equalsIgnoreCase(result2)) {
			System.out.println(selected+" group discussion");
			interview2.groupDiscussion(scanner, interview2);
		}
		else
			System.out.println(notSelected);
	}
	//
	void groupDiscussion(Scanner scanner, Interview2 interview2) {
		System.out.print("Enter your result : ");
		String result2=scanner.next();
		if(result1.equalsIgnoreCase(result2)) {
			System.out.println(selected+" technical round");
			technicalRound(scanner, interview2);
		}
		else
			System.out.println(notSelected);
	}
	//
	static void technicalRound(Scanner scanner, Interview2 interview2) {
		System.out.print("Enter your result : ");
		String result2=scanner.next();
		if(result1.equalsIgnoreCase(result2)) {
			System.out.println(selected+" HR round");
			interview2.hrRound(scanner);
		}
		else
			System.out.println(notSelected);
	}
	//
	void hrRound(Scanner scanner) {
		System.out.print("Enter your result : ");
		String result2=scanner.next();
		if(result1.equalsIgnoreCase(result2))
			System.out.println("Congrats, we'll get you soon back !!");
		else
			System.out.println(notSelected);
	}
}
