package home;

import java.util.Arrays;

public class demo {
    public static void main(String args[]) {
    	
    	
   String a="java is programming language";
   
   
   String word[]=a.split(" ");
   
   System.out.println(Arrays.toString(word));
   
   for(int i=0;i<word.length;i++){
	   
       System.out.println(word[i].length());
       
   }
    }
}
