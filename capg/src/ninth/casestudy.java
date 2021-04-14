package ninth;
import java .util.*;
interface salary {
	void sal(ArrayList aaa);
}

interface name{
	void nam(ArrayList aaa);
}
interface senior{
	 void sen(ArrayList aaa);
}

public class casestudy {
public static void main(String args[]){
	
	employeerepository a=new employeerepository();
	a.set();
	ArrayList<Employee> b=new ArrayList<>(a.get());
	salary aa=(aaa)->{
		double sum=0;
		
		for(int i=0;i<aaa.size();i++) {
			Employee ne=(Employee)aaa.get(i);
			sum=sum+ne.getsalary();
		}
		System.out.println("salary sum"+" "+sum);
		
	};
	name a4=(aaa)->{
	
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<aaa.size();i++) {
			Employee ne=(Employee)aaa.get(i);
			if(map.containsKey(ne.name()))
			{
				int value=map.get(ne.name())+1;
				map.replace(ne.name(),value);
				
			}
			else
				map.put(ne.name(),1);
		}
		ArrayList<String> b1=new ArrayList<>(map.keySet());
		ArrayList<Integer> b2=new ArrayList<>(map.values());
		for(int i=0;i<b1.size();i++) {
			System.out.println("Department Name:"+b1.get(i)+" Department count:"+b2.get(i));
		}
	};
	senior sen=(aaa)->{
		for(int i=0;i<aaa.size();i++) {
			Employee ne=(Employee)aaa.get(i);
			if(ne.mid()==ne.eid())
				System.out.println("Senior name"+ne.name());
	}
	};
	aa.sal(b);
	a4.nam(b);
}
}
