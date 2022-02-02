package Basics;

public class Strings {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "xyz";

		String s3 = new String("abc");
		String s4 = new String("xyz");

		String s5 = s1.concat(s4);

		String s6 = "abc,xyz,ijk,klm,opq,efg";

		System.out.println(s1 == s3);
		System.out.println(s2.contentEquals(s4));

		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s5);

		System.out.println(s5.charAt(0));

		System.out.println(s5.indexOf("a"));

		System.out.println(s5.length());

		System.out.println(s5.substring(0, 4));

		String arr[] = s6.split(",");

		System.out.println(arr[4]);

		StringBuffer sbr = new StringBuffer("abcccc");
		sbr.reverse();
		sbr.append("Cap");
		System.out.println(sbr);

		StringBuilder bdr = new StringBuilder(s1);

		System.out.println(bdr);
		System.out.println(bdr.capacity());
		System.out.println(bdr.append("java "));

	}
}
