package Basics.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetOperations {

	public static void main(String args[]) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("Aashish");
		set.add("Anurag");

		Iterator<String> itr = set.iterator();

		System.out.println("set " + set.size());
		System.out.println("set " + set.contains("Anurag"));

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("name " + name);
		}
	}
}