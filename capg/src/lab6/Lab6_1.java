package lab6;
import java.util.*;
public class Lab6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lab6_1 l = new Lab6_1();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		System.out.println("Enter ID and Name !!");
		hm.put(sc.nextInt(),sc.next());
		hm.put(sc.nextInt(),sc.next());
		hm.put(sc.nextInt(),sc.next());
		hm.put(sc.nextInt(),sc.next());
		hm.put(sc.nextInt(),sc.next());
		System.out.print(l.getMap(hm));
		
		sc.close();
	}
	public List<String> getMap(HashMap<Integer,String> hm) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.putAll(hm);
		List<String> l = new ArrayList<String>();
		for(Map.Entry m : tm.entrySet())
		{
			l.add((String)m.getValue());
		}
		return l;
	}
}
