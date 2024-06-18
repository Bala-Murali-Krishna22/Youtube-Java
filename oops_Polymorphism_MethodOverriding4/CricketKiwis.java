package oops_Polymorphism_MethodOverriding4;

public class CricketKiwis implements CricketInterface {

	@Override
	public void batsman() {
		System.out.println("Newzeland batter");
	}

	@Override
	public void bowler() {
		System.out.println("Newzeland bowler");
	}

	@Override
	public void allRounder() {
		System.out.println("Newzeland allrounder");
	}

}
