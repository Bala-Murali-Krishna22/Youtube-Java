package oops_StaticNonstatic;

public class StaticNonstatic2 {
	public static void main(String[] args) {
		System.out.println("Main method"); //Main
		StaticNonstatic2 sn1=new StaticNonstatic2(); //Object creation
		StaticNonstatic2 sn2=new StaticNonstatic2();
		StaticNonstatic2 sn3=new StaticNonstatic2();
		read();
		sn1.write();
	}
	//Blocks
	static {
		System.out.println("Static-Block");
	}
	{
		System.out.println("Non-static block");
	}
	//Constructor
	StaticNonstatic2(){
		System.out.println("Constructor");
	}
	// //Methods
	static void read() {
		System.out.println("Static method : Read");
	}
	//
	void write() {
		System.out.println("Non-static method : Write");
	}
}
