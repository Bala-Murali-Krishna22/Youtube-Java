package oops_AccessModifiers;

public class Flower3 extends Flower1 {
	public static void main(String[] args) {
		Flower1 flower1=new Flower1();
		
		mPublic();
		System.out.println("Same package-same suclass");
		flower1.mProtected();
		System.out.println("Same package-same suclass");
		mDefault();
		System.out.println("Same package-same suclass");
	}
}
