package lab3;
import java.util.*;
public class Lab3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lab3_6 l = new Lab3_6();
		System.out.print(l.positiveString(sc.next()));
		sc.close();
	}
	public boolean positiveString(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		String s1 = new String(arr);
		return s1.equals(s);
	}
}

