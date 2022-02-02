package ExamPractice.M1Exam;

/*Develop an application for Income Tax Department .
Accept atleast five Tax Payers PAN Numbers and the five Tax Payers details and store them into a HashMap.

eg:-	HashMap<Long,TaxPayers>   TaxPayersHMap =new HashMap<>();

-> store atleast 5 TaxPayers PAN and TaxPayers personal details into the TaxPayersHMap Object.

before that, create the following classes.

-> class TaxPayers {
	  Propeties: name, phone, email, Address, TAX;
	  Include the proper Parameterized constructor, setters,getters and toString methods.
	}
-> class Address {
	properties: DoorNo, Street, city, State,pincode;
        Include the proper Parameterized constructor, setters,getters and toString methods.
	}

find out the following:-
--------------------------
-> display all PAN numbers in ascending order
-> display all TaxPayers Name in Descending order.
-> display the TaxPayer's Address by Collecting PAN Number ( Search)*/

import java.util.*;
import java.util.Map.Entry;

class TaxPayers {
	String name;
	long phone;
	String email;
	Address address;
	double TAX;

	public TaxPayers(String name, long phone, String email, Address address, double TAX) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.TAX = TAX;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhoneno(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getTAX() {
		return TAX;
	}

	public void setTAX(double TAX) {
		this.TAX = TAX;
	}

	@Override
	public String toString() {
		return "Taxpayers [name= " + name + ", phone= " + phone + ", email = " + email + ", address = " + address
				+ " TAX " + TAX + "]";
	}

	public boolean contains(String searchingData) {
		// TODO Auto-generated method stub
		return false;
	}

}

class Address {
	int DoorNo;
	String Street;
	String city;
	String state;
	int pincode;

	public Address(int DoorNo, String Street, String city, String state, int pincode) {
		super();
		this.DoorNo = DoorNo;
		this.Street = Street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getDoorNo() {
		return DoorNo;
	}

	public void setDoorNo(int DoorNo) {
		this.DoorNo = DoorNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [DoorNo= " + DoorNo + ", Street= " + Street + ", city= " + city + ", state = " + state
				+ ", pincode = " + pincode + "]";
	}
}

class TaxpayersDetails {
	HashMap<String, TaxPayers> hmap = new HashMap<>();
}

public class TestTaxPayers {
	public static void main(String[] args) {
		TaxpayersDetails td = new TaxpayersDetails();

		Address add1 = new Address(21, "Ganeshnagar", "Ratnagiri", "Maharashtra", 415612);
		// Address add2 = new Address(22,"Ramnagar","Hubli","Karnataka",412314);
		// Address add3 = new Address(24,"Shyaamnagar","Satara","Gujrat",567234);
		// Address add4 = new Address(25,"Shyaamnagar","Sangli","punjab",895674);
		Address add5 = new Address(26, "Shyaamnagar", "Kolhapur", "Rajasthan", 234786);

		TaxPayers tp1 = new TaxPayers("A", 9876543289l, "gd@gmail.com", add1, 20000);
		TaxPayers tp2 = new TaxPayers("B", 8892543289l, "sd@gmail.com", add1, 50000);
		TaxPayers tp3 = new TaxPayers("C", 9876289289l, "ma@gmail.com", add1, 40000);
		TaxPayers tp4 = new TaxPayers("D", 1234543289l, "ga@gmail.com", add1, 25000);
		TaxPayers tp5 = new TaxPayers("E", 8899543289l, "sh@gmail.com", add1, 12000);

		td.hmap.put("AXDF456386", tp1);
		td.hmap.put("BSFF457886", tp2);
		td.hmap.put("ESQW434586", tp3);
		td.hmap.put("JKKL456386", tp4);
		td.hmap.put("IOUL678986", tp5);

		TreeMap<String, TaxPayers> Tmap = new TreeMap<>(td.hmap);
		for (String L : Tmap.keySet())

			System.out.println(L);
		System.out.println(" ");
		@SuppressWarnings("rawtypes")
		Collection C = Tmap.values();
		@SuppressWarnings("rawtypes")
		Iterator Ct = C.iterator();
		int noOfNames = C.size();
		String[] names = new String[noOfNames];
		int idx = 0;

		while (Ct.hasNext()) {
			TaxPayers tp = (TaxPayers) Ct.next();
			names[idx++] = tp.getName();
		}
		Arrays.sort(names);
		for (int count = names.length - 1; count >= 0; count--) {
			System.out.println(names[count]);
		}

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println(" Enter Pannumber ");
		String searchingData = scan.next();

		Set<Entry<String, TaxPayers>> ES = Tmap.entrySet();

		System.out.println("searchingData");
		for (Map.Entry<String, TaxPayers> M : ES) {
			TaxPayers cvalues = new TaxPayers(searchingData, idx, searchingData, add5, idx);
			cvalues = M.getValue();
			String add = (String) M.getKey();
			if (cvalues.contains(searchingData)) {
				System.out.println(add);

			}
		}
		scan.close();
	}
}