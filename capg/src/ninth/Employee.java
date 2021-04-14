package ninth;

import java.util.Date;

public class Employee{
	int employee_id;
	String firstname;
	String lastname;
	String email;
	String phoneno;
	Date hiredate;
	String designation;
	double salary;
	int managerid;
	Department department;

	
	Employee(int employee_id,String firstname,String lastname,String email,String phoneno,String hiredate,String designation,double salary,int managerid,Department s){
	this.employee_id=employee_id;
	this.firstname=firstname;
	this.lastname=lastname;
	this.email=email;
	this.phoneno=phoneno;
	this.designation=designation;
	this.salary=salary;
	this.managerid=managerid;
	this.department=s;
	
	}
	public double getsalary()
	{
		return salary;
	}
	public String name() {
		
	return	department.name();
	}
	public int mid(){
		return managerid;
	} 
	public int eid(){
		return employee_id;
	} 	
}