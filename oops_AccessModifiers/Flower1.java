package oops_AccessModifiers;

public class Flower1 {
	public static void main(String[] args) {
		Flower1 flower1=new Flower1();
		mPublic();
		flower1.mProtected();
		mDefault();
		flower1.mPrivate();
	}
	public Flower1() {
		System.out.println("Constructor");
	}
	//
	public static String name1="Balu-public";
	protected static String name2="Balu-protected";
	static String name3="Balu-default";
	private static String name4="Balu-private";
	//
	public static void mPublic() {
		System.out.println(name1);
		System.out.println("Same package-Same class");
	}
	//
	protected void mProtected() {
		System.out.println(name2);
		System.out.println("Same package-Same class");
	}
	//
	static void mDefault() {
		System.out.println(name3);
		System.out.println("Same package-Same class");
	}
	//
	private void mPrivate() {
		System.out.println(name4);
		System.out.println("Same package-Same class");
	}
}
