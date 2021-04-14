package lab3;
import java.util.*;
public class Lab3_1 {

	public static void main(String[] args) {
		int sum=0,var;
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		sc.close();
		while(st.hasMoreTokens()) {
			var = Integer.valueOf(st.nextToken());
			sum+= var;
			System.out.println(var);
		}
		System.out.print(sum);
	}
}
