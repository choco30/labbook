package capg;

import java.util.Scanner;
 

public class fifth {
	public static int calculateSum(int n) {
		int sum=0;
		while(n!=0) {
		sum=sum+n%10;
		n=n/10;
		}
		
		if(sum%3==0||sum%5==0)
			return sum;
		else return -1;
		}
public static void main(String args[])
{	Scanner obj=new Scanner(System.in);
int count=0;
int n =obj.nextInt();
   System.out.println(fifth.calculateSum(n));
	}
}
