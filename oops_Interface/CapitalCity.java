package oops_Interface;

public interface CapitalCity {
	
	public void highCourt();
	
	public void collectorOffice();
	
	public void policeStation();
	
	public void busStation();
	
	//Till version 7 and public is default in this
	//After they introduced default and static methods in version 8
	
	default void transport() {
		people();
		System.out.println("Implement transport or no need...!");
	} //Optional to implement classes and they can use this or their own logic
	
	static void jobs() {
		people();
		System.out.println("Must provide jobs !");
	}
	
	//Introduced private methods in version 9 for no-code repeatation
	
	private static void people() {
		System.out.println("Local people are main priority");
	}
	
}
