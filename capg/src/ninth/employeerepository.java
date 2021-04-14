package ninth;

import java.util.ArrayList;

public class employeerepository {
	ArrayList<Employee> lis=new ArrayList<>();
	
	public void set() {
		Department d=new Department("assa","saas","sasa");
		Department dd=new Department("assa","saas","sasa");
		Department ddd=new Department("assa","saas","sasa");
	Employee a=new Employee(1,"ram","ab","jhwiuefh","45654564 ","04-01-1999","dwq",123,123,d);
	Employee b=new Employee(1,"ram","ab","jhwiuefh","45654564 ","04-01-1999","dwq",123,123,dd);
	Employee c=new Employee(1,"ram","ab","jhwiuefh","45654564 ","04-01-1999","dwq",123,123,ddd);
	
	lis.add(a);
	lis.add(b);
	lis.add(c);
}
    public ArrayList get() {
    	return lis;
    }
}