package oops_Polymorphism_MethodOverriding4;

public class CricketMain {
	public static void main(String[] args) {
//		CricketIndia india=new CricketIndia();
//		CricketKiwis kiwis=new CricketKiwis();
		CricketInterface india=new CricketIndia(); //Abstraction
		CricketInterface kiwis=new CricketKiwis(); //Abstraction
		
		india.batsman();
		india.bowler();
		india.allRounder();
		System.out.println();
		
		kiwis.batsman();
		kiwis.bowler();
		kiwis.allRounder();
	}
}
