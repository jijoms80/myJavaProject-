package HashMap;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm= new HashMap<>();
		HashMap<Integer, String> hm1= new HashMap<>();
		
		hm1.put(56, "jijo");
		hm1.put(29, "tinu"	);
		hm1.put(897, "evan");
		
		System.out.println(hm1.get(56));
		
		for (Integer name : hm1.keySet()) {
			System.out.println(name);
			
			
		}
		for (String name : hm1.values()) {
			System.out.println(name);
			
		}
		
		
		
		hm.put(0, 4568);
		hm.put(21, 5888);
		hm.put(3, 5845);
		hm.put(48, 9555);
		hm.put(55555, 5245);
		System.out.println(hm.get(0));
		
		for (Integer sinNo : hm.keySet()) {
			System.out.println(sinNo);
			
		}
		System.out.println("----------------------");
		for (Integer accountNo : hm.values()) {
			System.out.println(accountNo);
		}

	}

}
