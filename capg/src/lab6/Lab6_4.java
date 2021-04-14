package lab6;
import java.util.*;
public class Lab6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total No. of Students:-");
		int n= sc.nextInt();
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		System.out.println("Enter Students registration no. and marks :-");
		for(int i=0 ;i<n;i++)
			hs.put(sc.nextInt(),sc.nextInt());
		Lab6_4 l = new Lab6_4();
		System.out.println(l.getStudents(hs));
		sc.close();

	}
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		for(HashMap.Entry<Integer,Integer> it : hm.entrySet())
		{
			if(it.getValue()>90)
			{
				hs.put(it.getKey(),"Gold");
			}
			else if(it.getValue()>80&&it.getValue()<90)
			{
				hs.put(it.getKey(),"Silver");
			}
			else if(it.getValue()>70&&it.getValue()<80)
			{
				hs.put(it.getKey(),"Bronze");
			}
			else {
				hs.put(it.getKey(),"No Medal");
			}
		}
		return hs;
	}
}
