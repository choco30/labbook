package capg;

import java.util.Scanner;

public class eigth {
	
 public static boolean checkNumber(double a) {
	 boolean t ;
	 if(Math.ceil(Math.log(a)/Math.log(2))==Math.floor(Math.log(a)/Math.log(2))) {
		t= true ;
	}
	else
		t=false;
	return t;
 }
public static void main(String args[])
{	Scanner obj=new Scanner(System.in);

double n =obj.nextDouble();
   System.out.println(eigth.checkNumber(n));
	}
}
