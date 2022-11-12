package assignmentThree;

import java.util.ArrayList;
import java.util.List;

public class SumOfListNumbers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(4);
		li.add(8);
		li.add(10);
		li.add(12);
	
		int sum=0;
		
for(int i=0; i<li.size();i++) 
	
	sum += li.get(i);
	
	System.out.println("sum=========> "+sum);

			}


}
