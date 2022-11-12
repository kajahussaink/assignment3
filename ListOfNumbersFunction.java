package assignmentThree;

import java.util.LinkedList;

public class ListOfNumbersFunction {

	public static void main(String[] args) {
		
		int len;
		// TODO Auto-generated method stub
		LinkedList<Integer> myList=new LinkedList<Integer>();
		myList.add(33);
		myList.add(44);
		myList.add(55);
		myList.add(66);
		myList.add(77);
		myList.add(88);
		
		System.out.println(myList);
		
		myList.remove(1);
		System.out.println("Remove second element from list using index===>" + myList);
		myList.removeFirstOccurrence(55);
		System.out.println("Remove second element from list using value " + myList);
		myList.add(3, 90);
		System.out.println("Add 90 at index 3 " + myList);
		len=myList.size();
		System.out.println("Get the length of list " + len);
		
		
		for (int i=0; i<len;i++) {
			
			System.out.println("Print all values from list  "+ myList.get(i));
		}
		// convert list into array
			
			Integer[] arr = new Integer[myList.size()];
		
			for (int i=0; i<arr.length;i++) {
				
				arr[i]= myList.get(i);
				
			}
			 System.out.print("Elements of Array: ");
		        for (int i = 0 ; i < arr.length ; i++){
		            System.out.print(arr[i] + "  ");

		        }
	}

}
