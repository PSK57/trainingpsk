package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) throws WeakPasswordException {
		Implementation obj = new Implementation();
		System.out.println(obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1")));
		System.out.println(obj.signUp(new Credentials("Bob", "lqwertyuiop")));
	}
}

class Credentials {
	String userName;
	String password;

	public Credentials(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}

class Implementation {
	public String passwordValidator(Credentials details) throws WeakPasswordException {
		String pwd = details.password;
		Pattern P = Pattern.compile("[(A-Za-z)+(0-9)+@#$%&*]{8,40}");
		Matcher M = P.matcher(pwd);
		String str = "";
		if (M.matches()) {
			str = "valid password";
		} else if (pwd.length() < 8 || pwd.length() > 40) {
			throw new WeakPasswordException("length of the password is not between 8 to 40");
		} else {
			throw new WeakPasswordException("password must contain at least one alphabet");
		}
		return str;
	}

	public String signUp(Credentials details) throws WeakPasswordException {
		try {
			String str = passwordValidator(details);
			if (str.equals("valid password")) {
				return "signup successfully";
			}
		} catch (WeakPasswordException e) {
			return "invalid password";
		} catch (Exception e) {
			return "other exception";
		}
		return null;
	}
}

@SuppressWarnings("serial")
class WeakPasswordException extends Exception {
	public WeakPasswordException(String str) {
		super();
	}
}