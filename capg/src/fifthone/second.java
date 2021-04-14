package fifthone;
import java.util.*;
  class NameException extends Exception{
	public NameException(String message){
		 System.out.println(message);
	 }
 }
public class second  {
 

	 
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER FIRST NAME");
		String a=obj.next();
		System.out.println("ENTER LAST NAME");
		String b=obj.next();
		 
		try {
			if(a==null)
				throw  new NameException(" PLEASE ENTER FIRST NAME");
			
			if(b==null)
				throw  new NameException(" PLEASE ENTER  SECOND NAME");
			else
			System.out.println("name entered");
		}
		catch(NameException messgae) {
			System.out.println(messgae .getMessage());
		}
		finally {
			obj.close();
		}
		
	}

}
