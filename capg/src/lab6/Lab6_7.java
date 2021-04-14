package lab6;
import java.util.*;

public class Lab6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :-");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Lab6_7 l = new Lab6_7();
		int[] arr2=l.getSorted(arr);
		for( int a : arr2)
		{
			System.out.println(a);
		}
		sc.close();
	}
	public int[] getSorted(Integer[] arr) {
		int[] reverse = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(new StringBuffer(String.valueOf(arr[i])).reverse().toString());
		}
		List<Integer> l =new ArrayList<Integer>();
		l = Arrays.asList(arr);
		Collections.sort(l);
		for(int i=0;i<l.size();i++)
			reverse[i]=l.get(i);
		return reverse;
	}

}
