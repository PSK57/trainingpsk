package Basics.StreamAPI;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		// create a list and filter all even numbers from list
		// List<Integer> list = Arrays.asList(77,88,99,11,22);
		List<Integer> list1 = new ArrayList<>();
		list1.add(77);
		list1.add(88);
		list1.add(99);
		list1.add(11);
		list1.add(22);
		System.out.println(list1);

		List<Integer> l2 = Arrays.asList(22, 66, 99, 77, 66, 55, 33, 44);
		System.out.println(l2);

		// without Stream API
		List<Integer> ListEven = new ArrayList<>();
		for (Integer i : l2) {
			if (i % 2 == 0) {
				ListEven.add(i);
			}
		}
		System.out.println(ListEven);

		// with Stream API
		List<Integer> newList = l2.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
	}
}