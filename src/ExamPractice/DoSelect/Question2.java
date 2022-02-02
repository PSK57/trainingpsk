package ExamPractice.DoSelect;

import java.util.*;

class Mobile {

	public static HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	public static String s = new String();

	public static String addMobile(String company, String model) {
		ArrayList<String> arr = new ArrayList<>();
		if (mobiles.containsKey(company) == false) {
			arr.add(model);
			mobiles.put(company, arr);
		} else {
			arr = mobiles.get(company);
			arr.add(model);
			mobiles.put(company, arr);
		}
		return "Model is added successfully.";
	}

	public static ArrayList<String> getModels(String company) {
		ArrayList<String> arr = new ArrayList<>();
		if (mobiles.containsKey(company) == true) {
			arr = mobiles.get(company);
		} else {
			System.out.println("Company Model not available.");
		}
		return arr;
	}

	public static String buyMobile(String company, String model) {
		ArrayList<String> arr = new ArrayList<>();
		if (mobiles.containsKey(company) == true && (mobiles.get(company).contains(model))) {
			arr = mobiles.get(company);
			int a = arr.indexOf(model);
			arr.remove(a);
			return "Model is bought successfully.";
		} else {
			return "Model not available.";
		}
	}
}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String addCom = sc.nextLine();
		String addMod = sc.nextLine();
		String getCom = sc.nextLine();
		String buyCom = sc.nextLine();
		String buyMod = sc.nextLine();
		System.out.println(Mobile.addMobile(addCom, addMod));
		System.out.println(Mobile.getModels(getCom));
		System.out.println(Mobile.buyMobile(buyCom, buyMod));
		sc.close();
	}
}