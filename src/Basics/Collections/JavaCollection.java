package Basics.Collections;

import java.util.*;

public class JavaCollection {

	public static void main(String args[]) {

		// JavaCollection jc = new JavaCollection();

		Vector<String> arlist = new Vector<>();

		// ArrayList<Customer> custList = new ArrayList<>();

		arlist.add("Rajesh");
		arlist.add("Nagesh");
		arlist.add("JAMES");
		arlist.add("Shreya");

		System.out.println("arlist size : " + arlist.size());

		arlist.remove(3);
		arlist.remove("Nagesh");

		boolean isthere = arlist.contains("Rajesh");

		System.out.println("is exist " + isthere);

		Iterator<String> itr = arlist.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("name " + name);
		}
	}
}