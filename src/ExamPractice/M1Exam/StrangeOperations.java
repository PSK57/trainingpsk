package ExamPractice.M1Exam;

import java.util.*;

class People {
	private String name;
	private Integer age;
	private Gender gender;

	enum Gender {
		MAN, WOMEN
	};

	public People(String name, Integer age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

class PeopleImplementation {
	// Write Your Code Here..

	public Integer minimumAgeContainingE(Collection<People> peoples) {
		try {
			Comparator<People> comparing = Comparator.comparing(People::getAge);
			People match = peoples.stream().filter(s -> s.getName().contains("e")).min(comparing).get();
			Integer result = match.getAge();

			return result;
		}

		catch (NoSuchElementException e) {
			return -1;
		}

	}

	public Integer getAgeOfOldestMan(Collection<People> peoples) {
		Comparator<People> comparing = Comparator.comparing(People::getAge);
		People match = peoples.stream().max(comparing).get();
		Integer result = match.getAge();

		return result;
	}
}

public class StrangeOperations {
	public static void main(String args[]) throws Exception {
		Collection<People> peoples = Arrays.asList(new People("Vivek", 16, People.Gender.MAN),
				new People("Kayle", 23, People.Gender.WOMEN), new People("Jeremy", 42, People.Gender.MAN),
				new People("Ivan", 69, People.Gender.MAN));
		PeopleImplementation p = new PeopleImplementation();
		System.out.println(p.minimumAgeContainingE(peoples));
		System.out.println(p.getAgeOfOldestMan(peoples));
	}
}