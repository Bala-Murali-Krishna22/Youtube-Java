package oops_Abstraction3;

public abstract class AtmAbstract implements AtmInterface{
	public void keypad() {
		System.out.println("Keypad code");
	}

	public void receiptPrinter() {
		System.out.println("Receipt-printer code");
	}
}
