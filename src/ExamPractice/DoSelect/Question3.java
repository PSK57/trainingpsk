package ExamPractice.DoSelect;

import java.util.*;

class Activity {

	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}

public class Question3 {

	public String handleException(Activity a) {
		String str;
		try {
			if (a.string1.equals(null) || a.string2.equals(null)) {
				throw new NullPointerException();
			}
			if (!(a.operator.equals("+")) && !(a.operator.equals("-"))) {
				throw new Exception();
			}
			str = "No Exception Found";
		} catch (NullPointerException e) {
			str = "Null values found";
		} catch (Exception e) {
			str = "Default Exception" + a.operator;
		}
		return str;
	}

	public String doOperation(Activity a) {
		String res;
		switch (a.operator) {
		case "+": {
			res = a.string1.concat(a.string2);
			break;
		}
		case "-": {
			String regex = a.string2;
			res = a.string1.replaceAll(regex, "");
			break;
		}
		default: {
			res = null;
			break;
		}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		String operator = sc.next();
		Question3 Sou = new Question3();
		Activity A = new Activity(string1, string2, operator);
		System.out.println(Sou.handleException(A));
		System.out.println(Sou.doOperation(A));
		sc.close();
	}
}