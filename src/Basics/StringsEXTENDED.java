package Basics;

public class StringsEXTENDED {
	public static void main(String[] args) {
		char StringArray[] = { 'C', 'a', 'p', 'g', 'e', 'm', 'i', 'n', 'i' };
		String Name = new String(StringArray);

		System.out.println(Name);
		System.out.println(Name.length());

		String s2 = " cAPGEMINI";
		System.out.println(Name.concat(s2));
		System.out.println("Name ".concat(Name));
		System.out.println(Name + "!");

		System.out.println(Name.charAt(5));

		System.out.println(Name.compareTo(s2));

		System.out.println(Name.compareToIgnoreCase(s2));

		System.out.println(Name.contentEquals(s2));

		System.out.println(Name.endsWith("i"));

		System.out.println(Name.equals(s2));

		System.out.println(Name.contains(s2));

		System.out.println(Name.equalsIgnoreCase(s2));

		System.out.println(Name.getBytes());

		char ch[] = new char[Name.length()];
		for (int i = 0; i < Name.length(); i++) {
			ch[i] = Name.charAt(i);
		}
		Name.getChars(1, 3, ch, 4);
		String Name2 = new String(ch);
		System.out.println(Name2);

		System.out.println(Name);

		System.out.println(Name.hashCode());

		char c = 'g';
		System.out.println(Name.indexOf(c));

		System.out.println(Name.indexOf(c, 3)); // Didn't understand.

		System.out.println(Name.intern());
		System.out.println(Name2.intern());
		System.out.println(s2.intern());

		System.out.println(Name.lastIndexOf(ch[7]));

		System.out.println(Name.matches(s2));

		System.out.println(Name.replace(c, ch[5]));

		System.out.println(Name.replaceAll(Name2, Name)); // Didn't understand.

		System.out.println(Name.substring(2));

		System.out.println(Name.substring(2, 5));

		System.out.println(Name.toCharArray()); // Didn't understand.

		System.out.println(Name.toLowerCase());
		System.out.println(Name.toUpperCase());

		System.out.println(" Hey!! Dude ".trim());
	}
}
