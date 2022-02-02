package Practice;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student() {
		super();
	}

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class HRGenericEasy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> sl = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			sl.add(st);

			testCases--;
		}
		for (int i = 0; i < sl.size(); i++) {
			double grade = sl.get(i).getCgpa();
			int roll = sl.get(i).getId();
			for (int j = i + 1; j < sl.size(); j++) {
				if (grade < sl.get(j).getCgpa()) {
					grade = sl.get(j).getCgpa();
					Swap(sl, i, j);
				} else if (grade == sl.get(j).getCgpa() && !(sl.get(i).getFname().equals(sl.get(j).getFname()))) {
					String str1 = sl.get(i).getFname();
					String str2 = sl.get(j).getFname();
					int len = str1.length() > str2.length() ? str2.length() : str1.length();
					for (int a = 0; a < len; a++) {
						char ch1 = str1.charAt(a);
						char ch2 = str2.charAt(a);
						if (ch1 < ch2) {
							break;
						} else if (ch1 > ch2) {
							Swap(sl, i, j);
							break;
						}
					}
				} else if (grade == sl.get(j).getCgpa() && (sl.get(i).getFname().equals(sl.get(j).getFname()))) {
					if (roll > sl.get(j).getId()) {
						Swap(sl, i, j);
					}
				}
			}
		}
		for (Student st : sl) {
			System.out.println(st.getFname());
		}
		in.close();
	}

	public static void Swap(List<Student> sl, int i, int j) {
		Student st = sl.get(i);
		sl.set(i, sl.get(j));
		sl.set(j, st);
	}
}