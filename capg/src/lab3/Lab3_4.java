package lab3;
import java.util.*;
public class Lab3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lab3_4 l = new Lab3_4();
		System.out.println("Enter a Number ");
		System.out.println(l.modifyNumber(sc.nextInt()));
		sc.close();
	}
	public int modifyNumber(int n) {
		String s =String.valueOf(n);		
		StringBuffer sb = new StringBuffer();
		int len = s.length();
		for(int i=0;i<len-1;i++)
		{
			sb.append(Math.abs((int)s.charAt(i+1)-(int)s.charAt(i)));
		}
		sb.append(s.charAt(len-1));
	
	return Integer.parseInt(sb.toString());
}
}