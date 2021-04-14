package eight;
import java.util.*;

public class Lab2_2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		char[] arr= sc.nextLine().toCharArray();
		n=arr.length;
		Lab2_2 l = new Lab2_2();
		System.out.print(l.sortString(arr,n));
		sc.close();
	}
	public String sortString(char[] arr,int n) {
		Arrays.sort(arr);
		int l;
		if(n%2==0)
			l=n/2;
		else
			l=(n/2)+1;
		for(int i=0;i<l;i++)
			arr[i]=Character.toUpperCase(arr[i]);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++)
			sb.append(arr[i]);
		return sb.toString();
	}
}
