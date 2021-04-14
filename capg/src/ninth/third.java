package ninth;

import java.util.Scanner;

interface validate{
	void validation(String username,String passwor);
}
public class third {
public static void main(String args[]) {
	
	String user="ram";

	String pass="abc";
	
	validate asd=(username,passwor)->{
		if(user==username && pass==passwor) {
			System.out.println("true");}
			else 
				System.out.println(username+passwor+ " "+user+pass );
		
		
	};
	asd.validation("ram","abc");
	
}
}
