package ExamPractice.DoSelect;

import java.util.*;

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException {
		String res = new String();
		if (age >= 19) {
			if (age >= 21 && highestQualification.equals("B.E")) {
				res = "We have openings for junior developer";
			} else if (age >= 26 && highestQualification.equals("M.S") || highestQualification.equals("PhD")) {
				res = "We have openings for senior developer";
			} else if (age >= 19 && !(highestQualification.equals("M.S")) && !(highestQualification.equals("PhD"))
					&& !(highestQualification.equals("B.E"))) {
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			} else {
				res = "Sorry we have no openings for now";
			}
			return res;
		} else {
			throw new NotEligibleException("You are underage for any job");
		}
	}
}

public class Question4 {
	public static void main(String args[]) throws NotEligibleException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.nextLine();
		Question4 Sou = new Question4();
		String highestQualification = sc.nextLine();
		System.out.println(Sou.searchForJob(age, highestQualification));
		sc.close();
	}

	public String searchForJob(int age, String highestQualification) throws NotEligibleException {
		String s = new String();
		if (age >= 200 || age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		} else {
			s = CompanyJobRepository.getJobPrediction(age, highestQualification);
			return s;
		}
	}
}

@SuppressWarnings("serial")
class NotEligibleException extends Exception {
	public NotEligibleException(String msg) {
		super(msg);
	}
}