package assignmentThree;

import java.util.LinkedList;

public class DisplayTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> automationtools=new LinkedList<String>();
		automationtools.add("Web Automation");
		automationtools.add("API Automation");
		automationtools.add("Mobile Automation");
		System.out.println(automationtools);
				
		for(int i=0; i<automationtools.size();i++) {
			System.out.println(automationtools.get(i));
		
		if(automationtools.get(i).contains("Mobile")) {
			
			System.out.println("It contains===True");
			
		}
			else {
			
			System.out.println("It contains===False");
		}
}
	}

}
