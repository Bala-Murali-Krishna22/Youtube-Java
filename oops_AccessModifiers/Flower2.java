package oops_AccessModifiers;

public class Flower2 {
	public static void main(String[] args) {
		Flower1 flower1=new Flower1();
		
		flower1.mPublic();
		System.out.println("Same package-different class");
		flower1.mProtected();
		System.out.println("Same package-different class");
		flower1.mDefault();
		System.out.println("Same package-different class");
	}
}
