package Basics.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String args[]) {

		List<String> names = Arrays.asList("Yash", "Shantanu", "", "Prajakta", "", "Radhika", "", "", "Swara", "");
		List<String> listFilteredNames = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.toList());
		String mergedFilteredNames = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.joining(", "));

		System.out.println("The filtered names in List are - " + listFilteredNames);
		System.out.println("The filtered names as a string is - " + mergedFilteredNames);

		int count = (int) names.stream().filter(name -> name.isEmpty()).count();

		System.out.println("The total number of empty names are: " + count);
	}
}