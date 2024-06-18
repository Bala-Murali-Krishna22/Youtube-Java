package oops_Abstraction3;

public class AtmMain {
	public static void main(String[] args) {
//		AtmSbi sbi=new AtmSbi();
//		AtmUbi ubi=new AtmUbi();
		AtmInterface sbi=new AtmSbi(); //Abstraction
		AtmInterface ubi=new AtmUbi(); //Abstraction
		
		sbi.withdrawl();
		sbi.transfer();
		sbi.balanceEnquiry();
		sbi.pinChange();
		sbi.keypad();
		sbi.receiptPrinter();
		System.out.println();
		
		ubi.withdrawl();
		ubi.transfer();
		ubi.balanceEnquiry();
		ubi.pinChange();
		ubi.keypad();
		ubi.receiptPrinter();
	}
}