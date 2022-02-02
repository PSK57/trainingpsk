package ClassQueries;

public class StringProblem {
	public static void main(String args[]) {
		/*
		 * String s1 = "abc"; StringBuffer sbr1 = new StringBuffer(s1);
		 * System.out.println(s1.equals(sbr1)+","+sbr1.equals(s1));
		 * 
		 * String s2 = "abc"; StringBuffer sbr2 = new StringBuffer("abc");
		 * System.out.println(s2.equals(sbr2)+","+sbr2.equals(s2));
		 */

		String s3 = "abc";
		String sbr3 = new String(s3);
		System.out.println(s3.equals(sbr3) + "," + sbr3.equals(s3));

		String s6 = "abc";
		String sbr6 = new String("abc");
		System.out.println(s6.equals(sbr6) + "," + sbr6.equals(s6));

		String s4 = "A";
		if (s4.length() == 1) {
			System.out.println("1");
		} else if (s4 == "A") {
			System.out.println("2");
		} else {
			System.out.println("3");
		}

		String obj = "hello";
		String obj1 = "world";
		String obj2 = "hello";
		System.out.println(obj.equals(obj1) + " " + obj.equals(obj2));

		/*
		 * String s5 = null; if(s5.length()==0) {System.out.println("1");} else
		 * if(s5==null) {System.out.println("2");} else {System.out.println("3");}
		 */
	}
}
