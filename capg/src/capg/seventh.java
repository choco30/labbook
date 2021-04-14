package capg;
import java.util.*;
public class seventh {
public static boolean checkNumber(String s) throws Exception
{  char arr[]=s.toCharArray();
boolean t=true;
     for(int i=0;i<arr.length;i++) {
    	 int a=Integer.parseInt(Character.toString(arr[i]));
    	 for(int j=i+1;j<arr.length;j++) {
    		 int b=Integer.parseInt(Character.toString(arr[j]));
    		 if(a>b)
    			 
    		 {  throw new Exception("invalid");
    			
    			
    		 }
    	 }
    	 
     }
     return t;
  	
}
	public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	String s=obj.next();
	try {
		System.out.println(seventh.checkNumber(s));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
