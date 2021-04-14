package lab3;
import java.util.*;
public class Lab3_2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String");
	Lab3_2 l = new Lab3_2();
	System.out.print(l.getImage(sc.next()));
	sc.close();
	}
	public StringBuffer getImage(String s) {
		StringBuffer sb= new StringBuffer(s);
		StringBuffer sb2= new StringBuffer(s); 
		return sb2.append("|" + sb.reverse());
	}
}
