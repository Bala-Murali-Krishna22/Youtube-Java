package oops_Polymorphism_MethodOverriding4;

public class CricketIndia implements CricketInterface {

	@Override
	public void batsman() {
		System.out.println("Indian batter");
	}

	@Override
	public void bowler() {
		System.out.println("Indian bowler");
	}

	@Override
	public void allRounder() {
		System.out.println("Indian allrounder");
	}

}