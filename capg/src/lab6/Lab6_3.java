package lab6;
import java.util.*;
public class Lab6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Lab6_3 l = new Lab6_3();
		System.out.print(l.getSquares(arr));
		sc.close();
	}

	public Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> squares = new HashMap<Integer,Integer>();
		for(int i: arr)
		{
			squares.put(i,i*i);
		}
		return squares;
	}
}
