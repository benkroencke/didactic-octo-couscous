package kampfrechner;

import java.util.ArrayList;
import java.util.Collections;

public class Testing {
	
//	public static void main(String[] args) {
//		
//		int random = 18;
//		
//		int i = 0;
//		while(i<1000) {
//
//			
//			double wert = Math.random()*random;
//			System.out.println((int) wert);
//			
//			i++;
//		}
//		 
//	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("dieser");
		list.add("satz");
		list.add("ergibt");
		list.add("noch");
		list.add("sehr");
		list.add("viel");
		list.add("sinn");
		
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		Collections.shuffle(list);
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		Collections.shuffle(list);

		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		 
	}

}
