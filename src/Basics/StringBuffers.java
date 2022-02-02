package Basics;

public class StringBuffers {
	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer("Sanjeet");

		System.out.println(sbr);

		System.out.println(sbr.append(" Kumar"));

		System.out.println(sbr.insert(7, " Psk"));

		System.out.println(sbr.replace(7, 11, " PSK"));

		System.out.println(sbr.delete(7, 11));

		System.out.println(sbr.reverse());
		System.out.println(sbr.reverse());

		System.out.println(sbr.capacity());

		System.out.println(sbr.charAt(6));

		System.out.println(sbr.length());

		System.out.println(sbr.substring(3, 7));
	}
}
