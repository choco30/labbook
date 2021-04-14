package capg;
import java.util.*;
public class third {
	public static int fibo(int a) {
		
		if(a==1)
			return 1;
		if(a==0)
			return 0;
		else
			return fibo(a-1)+fibo(a-2);}
		
	

public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int a =obj.nextInt();
     int aa=0;
     int b=1;
     int f=0;
	for(int i=0;i<=a-2;i++)
	{
		f=aa+b;
		aa=b;
		b=f;
		  
	}
	System.out.println(third.fibo(a));
System.out.println(f);
	
	
}
}
