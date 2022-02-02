package ExamPractice.M1Exam;

class Candidate {
	String name;
	int totalRating;
	int totalContest;

	public Candidate(String name, int totalRating, int totalContest) {
		this.name = name;
		this.totalRating = totalRating;
		this.totalContest = totalContest;
	}
}

class Validator {
	public String eligible(Candidate details) throws Exception {
		String result = "";
		if (details.totalRating < 1000) {
			throw new CriteriaMismatchException("minimum 1000 total rating is required");
		}

		else if (details.totalContest < 10) {
			throw new CriteriaMismatchException("minimum 10 contest participation is required");

		}

		result = "eligible candidate";

		return result;

	}

	public String sendInvite(Candidate details) throws Exception {
		String result = "";
		try {
			if (details.totalRating < 1000) {

				throw new CriteriaMismatchException("candidate is not eligible");
			}

			else if (details.totalContest < 10) {

				throw new CriteriaMismatchException("candidate is not eligible");

			}

			result = "invitation send";

		}

		catch (CriteriaMismatchException e) {
			result = e.getMessage();
		}

		catch (Exception e) {
			result = "other exception";
		}

		return result;

	}
}

@SuppressWarnings("serial")
class CriteriaMismatchException extends Exception {
	public CriteriaMismatchException(String msg) {
		super(msg);
	}
}

public class Example1 {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		Candidate data = new Candidate("Steve", 1020, 23);
		Validator check = new Validator();

		check.eligible(data);
		check.sendInvite(data);

	}
}