package day02;

public class Ex08_IfGrade {

	public static void main(String[] args) {
		int score = 86;
		if(score > 100) {
			System.out.println("Letter grade for " + score + " is N/A");
		}
		else if(score >= 90) {
			System.out.println("Letter grade for " + score + " is A.");
		}
		else if(score >= 80) {
			System.out.println("Letter grade for " + score + " is B.");
		}
		else if(score >= 70) {
			System.out.println("Letter grade for " + score + " is C.");
		}
		else if(score >= 60) {
			System.out.println("Letter grade for " + score + " is D.");
		}
		else {
			System.out.println("Letter grade for " + score + " is N/A.");
		}
		
	}

}
