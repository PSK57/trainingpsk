package Basics;

public class StringBuilders {
	public static void main(String args[]) {
		StringBuilder sbd = new StringBuilder();

		System.out.println(sbd.append("Sanjeet"));
		System.out.println(sbd.toString());
		System.out.println(sbd);

		System.out.println(sbd.appendCodePoint(7));

		System.out.println(sbd.capacity());

		System.out.println(sbd.charAt(5));

		System.out.println(sbd.codePointAt(4));

		System.out.println(sbd.codePointBefore(4));

		System.out.println(sbd.codePointCount(1, 4));

		System.out.println(sbd.deleteCharAt(7));

		System.out.println(sbd.delete(3, 7));

		sbd.ensureCapacity(20);
		System.out.println(sbd.capacity());

		System.out.println(sbd.indexOf("e"));

		System.out.println(sbd.insert(3, "jeet PSK"));

		System.out.println(sbd.lastIndexOf("e"));

		System.out.println(sbd.lastIndexOf("e", 7));

		System.out.println(sbd.length());

		System.out.println(sbd.replace(7, 11, " Kumar"));

		System.out.println(sbd.reverse());
		System.out.println(sbd.reverse());

		sbd.setCharAt(5, 'E');
		System.out.println(sbd);

		sbd.setLength(7);
		System.out.println(sbd);

		System.out.println(sbd.substring(3, 7));

		sbd.trimToSize();
		System.out.println(sbd);
	}
}
