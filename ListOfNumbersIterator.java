package assignmentThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListOfNumbersIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(4);
		li.add(8);
		li.add(10);
		li.add(12);
	    
		System.out.println(li);
		
		
		Iterator<Integer> values = li.iterator();
		
		 while (values.hasNext()) {
		
		System.out.println(values.next());
		 }
		
	}

}
