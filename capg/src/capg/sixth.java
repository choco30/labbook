package capg;

import java.util.Scanner;

public class sixth {
	public static int calculateDifference(int n) {
		int sum1=0;
		int sum2=0;
		while(n!=0) {
		sum1=sum1+(int)Math.pow(n%10,2);
		sum2=sum2+n%10;
		n=n/10;
		}
		sum2=(int)Math.pow(sum2,2);
		return sum1-sum2;
		}
public static void main(String args[])
{	Scanner obj=new Scanner(System.in);
int count=0;
int n =obj.nextInt();
   System.out.println(sixth.calculateDifference(n));
	}
}