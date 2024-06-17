package basic_Methods1;

public class Bank {
	public static void main(String[] args) {
		Bank bank=new Bank();
		greetCustomer();
		System.out.println("Current balance is : "+bank.getCurrentBalance());
		bank.deposit(700);
		System.out.println("Current balance is : "+bank.getCurrentBalance());
		withdrawl(300);
		System.out.println("Current balance is : "+bank.getCurrentBalance());
		bank.getCurrentBalance();
	}
	//
	static int currentBalance=1000;
	//
	public static void greetCustomer() {
		System.out.println("*** Hello, Welcome to the banking section ***");
	}
	//
	public void deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("Amount is deposited successfully !!");
	}
	//
	public static void withdrawl(int amount) {
		if(currentBalance > amount) {
			currentBalance=currentBalance-amount;
			System.out.println("Amount is withdrawl successfully !!");
		} else{
			System.out.println("Insufficient balance !");
		}
	}
	//
	public int getCurrentBalance() {
		return currentBalance;
	}
}
