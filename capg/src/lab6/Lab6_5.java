package lab6;
import java.util.*;
public class Lab6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:-");
		Integer [] arr=new Integer[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		Lab6_5 l = new Lab6_5();
		System.out.println(l.getSecondElement(arr));
		sc.close();
	}
	public int getSecondElement(Integer[] arr){
		List<Integer> al = new ArrayList<Integer>();
		al= Arrays.asList(arr);
		Collections.sort(al);
		return al.get(al.size()-2);
	}

}
