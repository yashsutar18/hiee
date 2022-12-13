package home;

public class program1 {
	
	//   P I G L A T I N
	
	
	public static void main ( String[] args) {
		
		String a = (" java is love ");
		String b = ("");
		 
		
		for(int i=0;i<a.length();i++) {
	     char ch=a.charAt(i);
	     
	     if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
	         
	         b=a.substring(i)+a.substring(0,i)+"AY";
	         
	         System.out.println(b);
	         break;
	     }
	 }

		
	}

}
