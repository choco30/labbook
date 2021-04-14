package eight;
import java.util.*;
public class Lab2_1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :- ");
		n= sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		Lab2_1 l = new Lab2_1();
		System.out.println(l.getSecondSmallest(arr));
		
		
	}
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
}
