package assignmentThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ValuesFromArrayToList {

	
	
	public static void arraytoarraylist(String arr[]) {
		
		 List<String> arr_list= new ArrayList<String>();
		 Collections.addAll(arr_list, arr);
		 System.out.print("Element"+arr_list);
			
		
		}	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    String s[]={"John","Kenny","Maria","Mumtha"};
		    arraytoarraylist(s);
	}

}
