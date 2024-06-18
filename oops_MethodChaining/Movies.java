package oops_MethodChaining;

public class Movies {
	public static void main(String[] args) {
		Movies movies=new Movies();
		movies.setMovieName("Salaar").setBudget(350000000).setCertificate('A').setHitTalk(true);
		//Method chaining
		
		System.out.printf("Movie name : %s%nBudget : %d%nCertificate : %c%nHit talk : %b",
				movies.getMovieName(), movies.getBudget(), movies.getCertificate(), movies.isHitTalk());
	}
	//Global variables
	String movieName;
	int budget;
	char certificate;
	boolean hitTalk; //True-Hit False-Flop

	//Methods
	public String getMovieName() {
		return movieName;
	}

	public Movies setMovieName(String movieName) {
		this.movieName = movieName;
		return this;
	}

	public int getBudget() {
		return budget;
	}

	public Movies setBudget(int budget) {
		this.budget = budget;
		return this;
	}

	public char getCertificate() {
		return certificate;
	}

	public Movies setCertificate(char certificate) {
		this.certificate = certificate;
		return this;
	}

	public boolean isHitTalk() {
		return hitTalk;
	}

	public Movies setHitTalk(boolean hitTalk) {
		this.hitTalk = hitTalk;
		return this;
	}
	//
}
