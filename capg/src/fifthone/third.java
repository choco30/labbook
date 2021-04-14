package fifthone;

import java.util.Scanner;

class EmployeeExeption extends Exception{
	public EmployeeExeption(String message){
		super(message);
		System.out.println(message);
	}
}
public class third {

	public static void main(String[] args) throws EmployeeExeption{
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER SALARY");
		int sallery=obj.nextInt();
		try {
			if(sallery<3000)
				throw new EmployeeExeption("your salary is low");
			else
				System.out.println("sallery entered");
		}
		
finally {obj.close();}
	}

}
