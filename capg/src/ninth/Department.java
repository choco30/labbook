package ninth;

public class Department{
	String departmentid;
	String departmentname;
	String managerid;
  Department(String departmentid,
	String departmentname,
	String managerid){
	  this.departmentid=departmentid;
	  this.departmentname=departmentname;
	  this.managerid=managerid;
  }
  public String id() {return departmentid ;}
  public String name() {return departmentname ;}
  public String mid() {return managerid ;}
}
