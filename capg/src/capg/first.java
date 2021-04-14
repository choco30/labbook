package capg;
import java.util.*;

public class first {
	
	public static  double calculate(int a) {
		double sum=0;
		while(a!=0) {
		sum=sum+(Math.pow(a%10,3));
		a=a/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     int a=obj.nextInt();
     System.out.println(first.calculate(a));

	}

}
