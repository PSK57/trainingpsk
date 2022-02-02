package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringToken {

	public static void main(String args[]) {
		String s = "He is a very very good boy, isn't he?";
		String splits[] = s.split("[!,?._'@ ]");
		splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		System.out.println(splits.length);
		for (String z : splits)
			System.out.println(z);
	}
}