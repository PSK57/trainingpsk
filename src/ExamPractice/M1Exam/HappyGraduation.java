package ExamPractice.M1Exam;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.*;
import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Collectors;

class Student {
//Write Your Code Here..

	public String name;
	public int graduationYear;
	public int score;

	public Student(String name, int graduationYear, int score) {
		this.name = name;
		this.graduationYear = graduationYear;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", graduationYear=" + graduationYear + ", score=" + score + '}';
	}
}

class Implementation {
//Write Your Code Here..

	public List<Student> studentsSorted(Collection<Student> students) {
		List<Student> sorted = students.stream().sorted(Comparator.comparingInt(Student::getScore).reversed())
				.collect(Collectors.toList());
		// List<Student> reSorted =
		// sorted.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		return sorted;
	}

	public Map<Integer, List<Student>> studentsByYear(Collection<Student> students) {
		Map<Integer, List<Student>> grads = students.stream().collect(groupingBy(Student::getGraduationYear));
		return grads;
	}

	public Student findOneBest(Collection<Student> students) {
		Comparator<Student> comparing = Comparator.comparing(Student::getScore);
		Student result = students.stream().max(comparing).get();

		return result;
	}

}

public class HappyGraduation {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Collection<Student> students;
		students = Arrays.asList(new Student("S2014-11", 2014, 17), new Student("S2014-18", 2014, 20),
				new Student("S2013-18", 2013, 20));

		Implementation i = new Implementation();
		System.out.println(i.studentsSorted(students));
		System.out.println(i.studentsByYear(students));
		System.out.println(i.findOneBest(students));
	}
}