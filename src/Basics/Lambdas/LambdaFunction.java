package Basics.Lambdas;

import java.util.ArrayList;

interface StringFunction {

	String run(String str);
}

public class LambdaFunction {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((n) -> System.out.println(n + 10));
		// LambdaFunction fn = new LambdaFunction();
		// fn.check();
		// printFormatted("Aashish",);

		StringFunction srintr1 = (s1) -> {
			System.out.println(s1 + "hello");
			System.out.println(s1 + s1.substring(0, 3));
			return s1;
		};

		StringFunction srintr2 = (s1) -> {
			return s1 + " This is first test";
		};

		System.out.println(srintr2.run(" TCSassignment"));
		System.out.println(srintr1.run(" Useful"));
	}
//public void check() { 
//	 StringFunction exclaim = (s) -> 
//	 {System.out.println("Hi"+ s); return s;}; 
//	 //s + "!"; StringFunction ask = (s) -> s + "?"; 
//	 printFormatted("Hello", exclaim); printFormatted("Hello", ask); } 
//	    
//public static void printFormatted(String str, StringFunction format) { 
//	    
//	String * result = format.run(str); 
//	    System.out.println(result); } */ 
}