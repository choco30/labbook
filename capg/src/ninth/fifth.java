package ninth;

import java.util.Scanner;

interface fact{
	void facto(int n);
}
 class factw{
	public static void factor(int n) {
		int temp=1;
		for(int i=1;i<=n;i++)
		{temp=temp*i;}
		System.out.print(temp);
	}
} 
public class fifth {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No");
		int f=obj.nextInt();
		// TODO Auto-generated method stub
       fact a=factw::factor;
       a.facto(f);
	}

}
