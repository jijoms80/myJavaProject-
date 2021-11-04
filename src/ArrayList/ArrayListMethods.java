package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> rollNo= new ArrayList<Integer>();
		
		
		rollNo.add(564854);
		rollNo.add(897546);
		rollNo.add(879546);
		rollNo.add(123654);
		rollNo.add(99999);
		
		System.out.println("size of the array list :"+rollNo.size());
		System.out.println(rollNo.get(4));
		
		rollNo.remove(4);
		
		for (Integer integer : rollNo) {
			System.out.println(integer);
			
		}
		
		for
		rollNo.clear();
		
		for(int i=0;i<rollNo.size();i++) {
			System.out.println(rollNo.get(i));
		}
		rollNo.remove(4);
	}

}
