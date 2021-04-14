package lab6;
import java.util.*;
public class Lab6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		Lab6_2 l = new Lab6_2();
		System.out.println(l.countChars(arr));
		sc.close();
	}
	public Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(char c: arr)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c,charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
		}
		return charMap;
	}
}
