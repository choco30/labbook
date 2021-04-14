package lab3;
import java.util.*;
public class Lab3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String ");
		Lab3_3 l = new Lab3_3();
		System.out.print(l.alterString(sc.next()));
		sc.close();
	}
	public String alterString(String st) {
		StringBuffer sb = new StringBuffer();
		String s= st.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'))
			{
				sb.append((char)(s.charAt(i)+1));
			}
			else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}

