package home;

import java.util.Arrays;

public class pract {

	
	public static void main (String[] args) {
		
	 String y = " hello my name is yash " ;
	 
	 System.out.println(y);
	 
	 String k[] =y.split(" ") ;
	 
	 System.out.println(Arrays.toString(k));
	 
	 for(int i=0; i<k.length;i++) {
		 System.out.println(k[i].length());
		 
	 }
		
				
	}
	
	

}
