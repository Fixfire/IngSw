package es04;

public class Grade {

	private final String subject;
	private final int points;
	private final int credits;
	
	public Grade(String subject, int points, int credits){
//		if(subject == null || points < 18 || points > 30 || credits <0)
//			throw (IllegalArgumentException);
		this.subject = subject;
		this.points = points;
		this.credits = credits;
	}
	
	public int getCredits(){
		return credits;
	}
}
