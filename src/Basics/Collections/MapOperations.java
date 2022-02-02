package Basics.Collections;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

//import com.test.Training.Customer;

public class MapOperations {

	public static void main(String args[]) {

		Hashtable<String, String> map = new Hashtable<String, String>();

		// HashMap<String,Customer> map1 = new HashMap<String,Customer>();

		map.put("1234", "Anurag");
		map.put("123431", "Gaurav");
		map.put("54546", "Shreya");
		map.put("78920", "Jenipala");

		System.out.println("Map " + map.size());
		System.out.println("Map " + map.isEmpty());

		// String value = map.get("1234");

		System.out.println("Value : " + map);

		Set<String> set = map.keySet();

		Iterator<String> itr = set.iterator();

		System.out.println("Set " + set.size());
		System.out.println("Set " + set.contains("Anurag"));

		while (itr.hasNext()) {
			String keys = itr.next();
			String val = map.get(keys);
			System.out.println("Key : " + keys + ", Value : " + val);
		}
	}
}