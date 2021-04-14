package lab6;
import java.util.*;
public class Lab6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total number of People:-");
		int n = sc.nextInt();
		Map<Integer,Integer> people =new HashMap<Integer,Integer>();
		System.out.println("Enter Id and Age of People :- ");
		for(int i =0;i<n;i++)
			people.put(sc.nextInt(),sc.nextInt());
		Lab6_6 l = new Lab6_6();
		System.out.println(l.votersList(people));
		sc.close();
	}
	public List<Integer> votersList(Map<Integer,Integer> list){
		List<Integer> eligible = new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> l : list.entrySet())
		{
			if(l.getValue()>18)
				eligible.add(l.getKey());
		}
		return eligible;
	}
}
