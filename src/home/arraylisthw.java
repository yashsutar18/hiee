
package home;

import java.util.ArrayList;

public class arraylisthw {
	
	public static void main(String[] args) {
		
		ArrayList<String> jk=new ArrayList<String>();
		jk.add("ram");
		jk.add("yash");
		jk.add("ayush");
		jk.add("pooja");
		jk.add("ram");
		
		System.out.println(jk);     // list
		
		jk.add(2,"neha");           //  Add neha
		
		System.out.println(jk);
		
		jk.remove(3);               //  Remove
		
		System.out.println(jk);
		
		System.out.println();
		
		// USING each LOOP
		
		for(String u:jk) {
			
			System.out.println(u);
			
		}
		
		System.out.println();
		
		// USING FOR LOOP 
		
		for(int i=0;i<jk.size();i++) {
			
			System.out.println(jk.get(i));
			
		}
				
		
		
	
		

		
	
	}
}
