package ninth;
import java.util.*;
interface format{
	void form(String c);
}
public class second {
	
public static void main(String args[]) {
Scanner obj=new Scanner(System.in);
System.out.println("Enter String");
String f=obj.nextLine();
f=f.replaceAll("\\s+","");
	format a=(c)->{
		for(int i=0;i<c.length();i++)
			System.out.print( c.charAt(i)+" ");
		
		
	};
	a.form(f);
}
}
