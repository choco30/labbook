package lab3;
import java.util.*;
public class Lab3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int words,lines,characters=0;
		String [] st = s.split(" ");
		words = st.length;
		for(int i=0;i<words;i++)
		{
			characters+=st[i].length();
		}
		String [] line = s.split(".");
		lines=line.length;
		System.out.println("Characters : - " + characters);
		System.out.println("Words : - " + words);
		System.out.println("Lines : - " + lines);
	}
}
