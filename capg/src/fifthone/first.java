package fifthone;

import java.io.IOException;
import java.util.Scanner;

class AgeException extends Exception {
 
 public AgeException(String message) {
  super(message);
 }
}
public class first {
 
 public static void main(String[] args)throws AgeException{
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age ");
 
  
 
	  int age = s.nextInt() ;throw new AgeException("age is low") ;
 
  
 }
}
	
