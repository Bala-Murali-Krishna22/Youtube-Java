package basic_Methods1;

import java.util.Random;
import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args) {
		/***/
		Bank2 bank2=new Bank2();
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		/***/
		bank2.personDetails(scanner); System.out.println();//1 
		detailsVerification(scanner, random); System.out.println();//2
		bank2.greetCustomer(); System.out.println();//3
		
		System.out.print("Enter deposit amount : ");
		int deposit=scanner.nextInt();
		depositAmount(deposit, bank2); System.out.println();//4
		
		System.out.print("Enter withdrawl amount : ");
		int withdrawl=scanner.nextInt();
		bank2.withdrawlAmount(withdrawl); System.out.println();//5
		
		bank2.balance(); //6
		/***/
	}
	//   Global Variables {
	static int currentBalance=1000;
	static String customerName;
	static long aadharCardNum;
	static long mobileNum;
	// }
	public void personDetails(Scanner scanner) {
		System.out.print("Enter customer name : ");
		customerName=scanner.nextLine();
		System.out.print("Enter aadhar card number : ");
		aadharCardNum=scanner.nextLong();
		System.out.print("Enter mobile number : ");
		mobileNum=scanner.nextLong();
	}
	//
	public static void detailsVerification(Scanner scanner,Random random) {
		String result;
		System.out.println("OTP sent to "+mobileNum);
		int otpCode=random.nextInt(1000);
		if(otpCode<1000)
			otpCode+=1000;
		System.out.println("Verification code : "+otpCode);
		
		System.out.print("Enter OTP sent to your mobile number : ");
		int userOtp=scanner.nextInt();
		if(otpCode==userOtp)
			result="Verification successfull !";
		else
			result="Invalid OTP !";
		System.out.println(result);
	}
	//
	public void greetCustomer() {
		System.out.println("Welcome to INDIAN Bank, Mr/Mrs."+customerName);
	}
	//
	static void depositAmount(int deposit, Bank2 bank2) {
		currentBalance+=deposit;
		System.out.println("Amount is deposited sussessfully !");
		System.out.println("Current balance is : "+bank2.balance());
	}
	//
	void withdrawlAmount(int withdrawl) {
		String result;
		if(withdrawl<currentBalance) {
			currentBalance-=withdrawl;
			result="Amount is withdrawl successfully !";
		}else
			result="Insufficient balance";
		System.out.println(result);
		System.out.println("Current balance is : "+balance());
	}
	//
	int balance() {
		return currentBalance;
	}
}
