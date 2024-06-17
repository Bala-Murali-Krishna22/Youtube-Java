package basic_ConditionalStatements3;

import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//
		System.out.println("What is your online assessment exam ?");
		String result=scanner.nextLine();
		if(result=="Pass") {
			System.out.println("Please, wait for round-1 !!");
			String round1=scanner.nextLine();
			if(round1=="Pass") {
				System.out.println("You have qualified round-1, wait for round-2 !!");
				String round2=scanner.nextLine();
				if(round2=="Pass") {
					System.out.println("You have qualified round-2, wait for HR-round !!");
					String HRround=scanner.nextLine();
					if(HRround=="Pass") {
						System.out.println("You have qualified HR-round, congrats!!");
					}else {
						System.out.println("You can go to home :) :)");
					}
				}else {
					System.out.println("You can go to home :) :)");
				}
			}else {
				System.out.println("You can go to home :) :)");
			}
		}else {
			System.out.println("You can go to home :) :)");
		}
		scanner.close();
	}
}
