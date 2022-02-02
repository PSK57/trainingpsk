package ExamPractice.M1Exam;

/*create a custom excpetion handling class: InvalidVotingException
create a class: Voter {
		private String name;
		private int age;
		//constructor
		//setters and getters
		//toString method
	}
	
add the below method in Voter class:  boolean isEligibleForVote()

operations or validations to be performed:-
	a) name is null (or) name is less than 5 characters. 
		then Exception must be thrown with message  as "VoterNameLengthIsInvalid".
	b) age is non-numeric or <21
		then Exception Must be thrown with message as "alidAge is in valid"
	c) name is not null and name has more than 4 characters and age>=21.
		then Voter is  Eligible to vote*/

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidVotingException extends Exception {
	InvalidVotingException(String msg) {
		super(msg);
	}
}

class Voter {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEligibleForVote() {
		try {

			if ((name.equals("null")) || (name.length() < 5))
				throw new InvalidVotingException("VoterNameLengthIsInvalid");
			else {

				if (age < 21 || age > 100)
					throw new InvalidVotingException("Ageis invalid");

				else {
					if (name.length() < 4 || age < 21 || (name.equals("null")))
						throw new InvalidVotingException("INvalid voter");
					else {

						System.out.println("valid voter");

					}
				}
			}
		}

		catch (InvalidVotingException e) {
			System.out.println(e.getMessage());

		}
		return true;

	}
}

public class TestVoter {
	public static void main(String[] args) {

		Voter v1 = new Voter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		v1.setName(name);
		v1.setAge(age);
		System.out.println(v1.getName());
		System.out.println(v1.getAge());
		v1.isEligibleForVote();
		sc.close();
	}

}